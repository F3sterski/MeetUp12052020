
package model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data_type",
    "data_format",
    "data_version",
    "CVE_data_meta",
    "affects",
    "problemtype",
    "references",
    "description"
})
public class CVEJSON40Min11 {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_type")
    private CVEJSON40Min11 .DataType dataType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_format")
    private CVEJSON40Min11 .DataFormat dataFormat;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_version")
    private CVEJSON40Min11 .DataVersion dataVersion;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVE_data_meta")
    private CVEDataMeta cVEDataMeta;
    @JsonProperty("affects")
    private Affects affects;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("problemtype")
    private Problemtype problemtype;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("references")
    private References references;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    private Description description;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_type")
    public CVEJSON40Min11 .DataType getDataType() {
        return dataType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_type")
    public void setDataType(CVEJSON40Min11 .DataType dataType) {
        this.dataType = dataType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_format")
    public CVEJSON40Min11 .DataFormat getDataFormat() {
        return dataFormat;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_format")
    public void setDataFormat(CVEJSON40Min11 .DataFormat dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_version")
    public CVEJSON40Min11 .DataVersion getDataVersion() {
        return dataVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_version")
    public void setDataVersion(CVEJSON40Min11 .DataVersion dataVersion) {
        this.dataVersion = dataVersion;
    }

    @JsonProperty("CVE_data_meta")
    public CVEDataMeta getCVEDataMeta() {
        return cVEDataMeta;
    }

    @JsonProperty("CVE_data_meta")
    public void setCVEDataMeta(CVEDataMeta cVEDataMeta) {
        this.cVEDataMeta = cVEDataMeta;
    }

    @JsonProperty("affects")
    public Affects getAffects() {
        return affects;
    }

    @JsonProperty("affects")
    public void setAffects(Affects affects) {
        this.affects = affects;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("problemtype")
    public Problemtype getProblemtype() {
        return problemtype;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("problemtype")
    public void setProblemtype(Problemtype problemtype) {
        this.problemtype = problemtype;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("references")
    public References getReferences() {
        return references;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("references")
    public void setReferences(References references) {
        this.references = references;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public Description getDescription() {
        return description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(Description description) {
        this.description = description;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CVEJSON40Min11 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataType");
        sb.append('=');
        sb.append(((this.dataType == null)?"<null>":this.dataType));
        sb.append(',');
        sb.append("dataFormat");
        sb.append('=');
        sb.append(((this.dataFormat == null)?"<null>":this.dataFormat));
        sb.append(',');
        sb.append("dataVersion");
        sb.append('=');
        sb.append(((this.dataVersion == null)?"<null>":this.dataVersion));
        sb.append(',');
        sb.append("cVEDataMeta");
        sb.append('=');
        sb.append(((this.cVEDataMeta == null)?"<null>":this.cVEDataMeta));
        sb.append(',');
        sb.append("affects");
        sb.append('=');
        sb.append(((this.affects == null)?"<null>":this.affects));
        sb.append(',');
        sb.append("problemtype");
        sb.append('=');
        sb.append(((this.problemtype == null)?"<null>":this.problemtype));
        sb.append(',');
        sb.append("references");
        sb.append('=');
        sb.append(((this.references == null)?"<null>":this.references));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.references == null)? 0 :this.references.hashCode()));
        result = ((result* 31)+((this.dataVersion == null)? 0 :this.dataVersion.hashCode()));
        result = ((result* 31)+((this.dataFormat == null)? 0 :this.dataFormat.hashCode()));
        result = ((result* 31)+((this.dataType == null)? 0 :this.dataType.hashCode()));
        result = ((result* 31)+((this.cVEDataMeta == null)? 0 :this.cVEDataMeta.hashCode()));
        result = ((result* 31)+((this.affects == null)? 0 :this.affects.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.problemtype == null)? 0 :this.problemtype.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CVEJSON40Min11) == false) {
            return false;
        }
        CVEJSON40Min11 rhs = ((CVEJSON40Min11) other);
        return ((((((((((this.references == rhs.references)||((this.references!= null)&&this.references.equals(rhs.references)))&&((this.dataVersion == rhs.dataVersion)||((this.dataVersion!= null)&&this.dataVersion.equals(rhs.dataVersion))))&&((this.dataFormat == rhs.dataFormat)||((this.dataFormat!= null)&&this.dataFormat.equals(rhs.dataFormat))))&&((this.dataType == rhs.dataType)||((this.dataType!= null)&&this.dataType.equals(rhs.dataType))))&&((this.cVEDataMeta == rhs.cVEDataMeta)||((this.cVEDataMeta!= null)&&this.cVEDataMeta.equals(rhs.cVEDataMeta))))&&((this.affects == rhs.affects)||((this.affects!= null)&&this.affects.equals(rhs.affects))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.problemtype == rhs.problemtype)||((this.problemtype!= null)&&this.problemtype.equals(rhs.problemtype))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public enum DataFormat {

        MITRE("MITRE");
        private final String value;
        private final static Map<String, CVEJSON40Min11 .DataFormat> CONSTANTS = new HashMap<String, CVEJSON40Min11 .DataFormat>();

        static {
            for (CVEJSON40Min11 .DataFormat c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DataFormat(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CVEJSON40Min11 .DataFormat fromValue(String value) {
            CVEJSON40Min11 .DataFormat constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum DataType {

        CVE("CVE");
        private final String value;
        private final static Map<String, CVEJSON40Min11 .DataType> CONSTANTS = new HashMap<String, CVEJSON40Min11 .DataType>();

        static {
            for (CVEJSON40Min11 .DataType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DataType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CVEJSON40Min11 .DataType fromValue(String value) {
            CVEJSON40Min11 .DataType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum DataVersion {

        _4_0("4.0");
        private final String value;
        private final static Map<String, CVEJSON40Min11 .DataVersion> CONSTANTS = new HashMap<String, CVEJSON40Min11 .DataVersion>();

        static {
            for (CVEJSON40Min11 .DataVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DataVersion(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CVEJSON40Min11 .DataVersion fromValue(String value) {
            CVEJSON40Min11 .DataVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
