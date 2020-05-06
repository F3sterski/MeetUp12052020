package analyzis;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang3.StringUtils;
import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.codemodel.JCodeModel;

import model.CvssV20;
import model.DefCveItem;
import model.NvdCveFeedJson11;


public class Statistics {

	public static void main(String... input) throws IOException {
		
		int sumB = 0;
		double riskB = 0.0;
		double riskW = 0.0;
		List<Double> statsBlack = new ArrayList<>();
		List<Double> statsWhite = new ArrayList<>();

		int sumW = 0;
		int sum = 0;
		int[] white = new int[3]; 
		int[] black = new int[3]; 
		
		int[] WYears = new int[19]; 
		int[] BYears = new int[19]; 
		
		for(int i=2002; i<2021; i++) {
			File file = new File("src\\main\\resources\\nvdcve-1.1-"+i+".json");  
			ObjectMapper objectMapper = new ObjectMapper(); 
			NvdCveFeedJson11 cves = objectMapper.readValue(file,NvdCveFeedJson11.class);
			
			for(DefCveItem cve : cves.getCVEItems()) {
				if(StringUtils.containsIgnoreCase(cve.getCve().getDescription().toString(), "blacklist")) {
					sumB++;
					riskB+=cve.getImpact().getBaseMetricV2().getCvssV2().getBaseScore();
					statsBlack.add(cve.getImpact().getBaseMetricV2().getCvssV2().getBaseScore());
					BYears[i-2002]++;
					baseMetricV2(black, cve);
				}
				
				if(StringUtils.containsIgnoreCase(cve.getCve().getDescription().toString(), "whitelist")) {
					sumW++;
					riskW+=cve.getImpact().getBaseMetricV2().getCvssV2().getBaseScore();
					WYears[i-2002]++;
					statsWhite.add(cve.getImpact().getBaseMetricV2().getCvssV2().getBaseScore());

					baseMetricV2(white, cve);
				}
				
				sum++;
			}
					
		}
		
		System.out.println("finished\n sumB= " + sumB + "\n sumW= "+sumW + "\n riskB = " + riskB/sumB+ "\n riskW = " + riskW/sumW);
		System.out.println("\n whiteL= " + white[0] + "\n whiteM= "+white[1] + "\n whiteH = " + white[2]);
		System.out.println("\n blackL= " + black[0] + "\n blackM= "+black[1] + "\n blackH = " + black[2]);
		System.out.println("\n White years " + Arrays.toString(WYears));
		System.out.println("\n Black years " + Arrays.toString(BYears));
		
		System.out.println("\n Black stats " + median(statsBlack.stream().sorted(Comparator.naturalOrder()).toArray()));
		System.out.println("\n White stats " + median(statsWhite.stream().sorted(Comparator.naturalOrder()).toArray()));
		
		System.out.println(sum);
	}

	private static void baseMetricV2(int[] white, DefCveItem cve) {
		switch(cve.getImpact().getBaseMetricV2().getCvssV2().getAccessComplexity()) {
		case LOW: white[0]++; break;
		case MEDIUM: white[1]++; break;
		case HIGH: white[2]++; break;

		}
	}

	public static double median(Object[] m) {
	    int middle = m.length/2;
	    if (m.length%2 == 1) {
	        return (double)m[middle];
	    } else {
	        return ((double)m[middle-1] + (double)m[middle]) / 2.0;
	    }
	}
	
}
