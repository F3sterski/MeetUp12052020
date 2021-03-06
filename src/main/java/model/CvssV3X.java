
package model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * JSON Schema for Common Vulnerability Scoring System version 3.x
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "vectorString",
    "attackVector",
    "attackComplexity",
    "privilegesRequired",
    "userInteraction",
    "scope",
    "confidentialityImpact",
    "integrityImpact",
    "availabilityImpact",
    "baseScore",
    "baseSeverity",
    "exploitCodeMaturity",
    "remediationLevel",
    "reportConfidence",
    "temporalScore",
    "temporalSeverity",
    "confidentialityRequirement",
    "integrityRequirement",
    "availabilityRequirement",
    "modifiedAttackVector",
    "modifiedAttackComplexity",
    "modifiedPrivilegesRequired",
    "modifiedUserInteraction",
    "modifiedScope",
    "modifiedConfidentialityImpact",
    "modifiedIntegrityImpact",
    "modifiedAvailabilityImpact",
    "environmentalScore",
    "environmentalSeverity"
})
public class CvssV3X {

    /**
     * CVSS Version
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("CVSS Version")
    private CvssV3X.Version version;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vectorString")
    private String vectorString;
    @JsonProperty("attackVector")
    private CvssV3X.AttackVectorType attackVector;
    @JsonProperty("attackComplexity")
    private CvssV3X.AttackComplexityType attackComplexity;
    @JsonProperty("privilegesRequired")
    private CvssV3X.PrivilegesRequiredType privilegesRequired;
    @JsonProperty("userInteraction")
    private CvssV3X.UserInteractionType userInteraction;
    @JsonProperty("scope")
    private CvssV3X.ScopeType scope;
    @JsonProperty("confidentialityImpact")
    private CvssV3X.CiaType confidentialityImpact;
    @JsonProperty("integrityImpact")
    private CvssV3X.CiaType integrityImpact;
    @JsonProperty("availabilityImpact")
    private CvssV3X.CiaType availabilityImpact;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseScore")
    private Double baseScore;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseSeverity")
    private CvssV3X.SeverityType baseSeverity;
    @JsonProperty("exploitCodeMaturity")
    private CvssV3X.ExploitCodeMaturityType exploitCodeMaturity;
    @JsonProperty("remediationLevel")
    private CvssV3X.RemediationLevelType remediationLevel;
    @JsonProperty("reportConfidence")
    private CvssV3X.ConfidenceType reportConfidence;
    @JsonProperty("temporalScore")
    private Double temporalScore;
    @JsonProperty("temporalSeverity")
    private CvssV3X.SeverityType temporalSeverity;
    @JsonProperty("confidentialityRequirement")
    private CvssV3X.CiaRequirementType confidentialityRequirement;
    @JsonProperty("integrityRequirement")
    private CvssV3X.CiaRequirementType integrityRequirement;
    @JsonProperty("availabilityRequirement")
    private CvssV3X.CiaRequirementType availabilityRequirement;
    @JsonProperty("modifiedAttackVector")
    private CvssV3X.ModifiedAttackVectorType modifiedAttackVector;
    @JsonProperty("modifiedAttackComplexity")
    private CvssV3X.ModifiedAttackComplexityType modifiedAttackComplexity;
    @JsonProperty("modifiedPrivilegesRequired")
    private CvssV3X.ModifiedPrivilegesRequiredType modifiedPrivilegesRequired;
    @JsonProperty("modifiedUserInteraction")
    private CvssV3X.ModifiedUserInteractionType modifiedUserInteraction;
    @JsonProperty("modifiedScope")
    private CvssV3X.ModifiedScopeType modifiedScope;
    @JsonProperty("modifiedConfidentialityImpact")
    private CvssV3X.ModifiedCiaType modifiedConfidentialityImpact;
    @JsonProperty("modifiedIntegrityImpact")
    private CvssV3X.ModifiedCiaType modifiedIntegrityImpact;
    @JsonProperty("modifiedAvailabilityImpact")
    private CvssV3X.ModifiedCiaType modifiedAvailabilityImpact;
    @JsonProperty("environmentalScore")
    private Double environmentalScore;
    @JsonProperty("environmentalSeverity")
    private CvssV3X.SeverityType environmentalSeverity;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * CVSS Version
     * (Required)
     * 
     */
    @JsonProperty("version")
    public CvssV3X.Version getVersion() {
        return version;
    }

    /**
     * CVSS Version
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(CvssV3X.Version version) {
        this.version = version;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vectorString")
    public String getVectorString() {
        return vectorString;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vectorString")
    public void setVectorString(String vectorString) {
        this.vectorString = vectorString;
    }

    @JsonProperty("attackVector")
    public CvssV3X.AttackVectorType getAttackVector() {
        return attackVector;
    }

    @JsonProperty("attackVector")
    public void setAttackVector(CvssV3X.AttackVectorType attackVector) {
        this.attackVector = attackVector;
    }

    @JsonProperty("attackComplexity")
    public CvssV3X.AttackComplexityType getAttackComplexity() {
        return attackComplexity;
    }

    @JsonProperty("attackComplexity")
    public void setAttackComplexity(CvssV3X.AttackComplexityType attackComplexity) {
        this.attackComplexity = attackComplexity;
    }

    @JsonProperty("privilegesRequired")
    public CvssV3X.PrivilegesRequiredType getPrivilegesRequired() {
        return privilegesRequired;
    }

    @JsonProperty("privilegesRequired")
    public void setPrivilegesRequired(CvssV3X.PrivilegesRequiredType privilegesRequired) {
        this.privilegesRequired = privilegesRequired;
    }

    @JsonProperty("userInteraction")
    public CvssV3X.UserInteractionType getUserInteraction() {
        return userInteraction;
    }

    @JsonProperty("userInteraction")
    public void setUserInteraction(CvssV3X.UserInteractionType userInteraction) {
        this.userInteraction = userInteraction;
    }

    @JsonProperty("scope")
    public CvssV3X.ScopeType getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(CvssV3X.ScopeType scope) {
        this.scope = scope;
    }

    @JsonProperty("confidentialityImpact")
    public CvssV3X.CiaType getConfidentialityImpact() {
        return confidentialityImpact;
    }

    @JsonProperty("confidentialityImpact")
    public void setConfidentialityImpact(CvssV3X.CiaType confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact;
    }

    @JsonProperty("integrityImpact")
    public CvssV3X.CiaType getIntegrityImpact() {
        return integrityImpact;
    }

    @JsonProperty("integrityImpact")
    public void setIntegrityImpact(CvssV3X.CiaType integrityImpact) {
        this.integrityImpact = integrityImpact;
    }

    @JsonProperty("availabilityImpact")
    public CvssV3X.CiaType getAvailabilityImpact() {
        return availabilityImpact;
    }

    @JsonProperty("availabilityImpact")
    public void setAvailabilityImpact(CvssV3X.CiaType availabilityImpact) {
        this.availabilityImpact = availabilityImpact;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseScore")
    public Double getBaseScore() {
        return baseScore;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseScore")
    public void setBaseScore(Double baseScore) {
        this.baseScore = baseScore;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseSeverity")
    public CvssV3X.SeverityType getBaseSeverity() {
        return baseSeverity;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseSeverity")
    public void setBaseSeverity(CvssV3X.SeverityType baseSeverity) {
        this.baseSeverity = baseSeverity;
    }

    @JsonProperty("exploitCodeMaturity")
    public CvssV3X.ExploitCodeMaturityType getExploitCodeMaturity() {
        return exploitCodeMaturity;
    }

    @JsonProperty("exploitCodeMaturity")
    public void setExploitCodeMaturity(CvssV3X.ExploitCodeMaturityType exploitCodeMaturity) {
        this.exploitCodeMaturity = exploitCodeMaturity;
    }

    @JsonProperty("remediationLevel")
    public CvssV3X.RemediationLevelType getRemediationLevel() {
        return remediationLevel;
    }

    @JsonProperty("remediationLevel")
    public void setRemediationLevel(CvssV3X.RemediationLevelType remediationLevel) {
        this.remediationLevel = remediationLevel;
    }

    @JsonProperty("reportConfidence")
    public CvssV3X.ConfidenceType getReportConfidence() {
        return reportConfidence;
    }

    @JsonProperty("reportConfidence")
    public void setReportConfidence(CvssV3X.ConfidenceType reportConfidence) {
        this.reportConfidence = reportConfidence;
    }

    @JsonProperty("temporalScore")
    public Double getTemporalScore() {
        return temporalScore;
    }

    @JsonProperty("temporalScore")
    public void setTemporalScore(Double temporalScore) {
        this.temporalScore = temporalScore;
    }

    @JsonProperty("temporalSeverity")
    public CvssV3X.SeverityType getTemporalSeverity() {
        return temporalSeverity;
    }

    @JsonProperty("temporalSeverity")
    public void setTemporalSeverity(CvssV3X.SeverityType temporalSeverity) {
        this.temporalSeverity = temporalSeverity;
    }

    @JsonProperty("confidentialityRequirement")
    public CvssV3X.CiaRequirementType getConfidentialityRequirement() {
        return confidentialityRequirement;
    }

    @JsonProperty("confidentialityRequirement")
    public void setConfidentialityRequirement(CvssV3X.CiaRequirementType confidentialityRequirement) {
        this.confidentialityRequirement = confidentialityRequirement;
    }

    @JsonProperty("integrityRequirement")
    public CvssV3X.CiaRequirementType getIntegrityRequirement() {
        return integrityRequirement;
    }

    @JsonProperty("integrityRequirement")
    public void setIntegrityRequirement(CvssV3X.CiaRequirementType integrityRequirement) {
        this.integrityRequirement = integrityRequirement;
    }

    @JsonProperty("availabilityRequirement")
    public CvssV3X.CiaRequirementType getAvailabilityRequirement() {
        return availabilityRequirement;
    }

    @JsonProperty("availabilityRequirement")
    public void setAvailabilityRequirement(CvssV3X.CiaRequirementType availabilityRequirement) {
        this.availabilityRequirement = availabilityRequirement;
    }

    @JsonProperty("modifiedAttackVector")
    public CvssV3X.ModifiedAttackVectorType getModifiedAttackVector() {
        return modifiedAttackVector;
    }

    @JsonProperty("modifiedAttackVector")
    public void setModifiedAttackVector(CvssV3X.ModifiedAttackVectorType modifiedAttackVector) {
        this.modifiedAttackVector = modifiedAttackVector;
    }

    @JsonProperty("modifiedAttackComplexity")
    public CvssV3X.ModifiedAttackComplexityType getModifiedAttackComplexity() {
        return modifiedAttackComplexity;
    }

    @JsonProperty("modifiedAttackComplexity")
    public void setModifiedAttackComplexity(CvssV3X.ModifiedAttackComplexityType modifiedAttackComplexity) {
        this.modifiedAttackComplexity = modifiedAttackComplexity;
    }

    @JsonProperty("modifiedPrivilegesRequired")
    public CvssV3X.ModifiedPrivilegesRequiredType getModifiedPrivilegesRequired() {
        return modifiedPrivilegesRequired;
    }

    @JsonProperty("modifiedPrivilegesRequired")
    public void setModifiedPrivilegesRequired(CvssV3X.ModifiedPrivilegesRequiredType modifiedPrivilegesRequired) {
        this.modifiedPrivilegesRequired = modifiedPrivilegesRequired;
    }

    @JsonProperty("modifiedUserInteraction")
    public CvssV3X.ModifiedUserInteractionType getModifiedUserInteraction() {
        return modifiedUserInteraction;
    }

    @JsonProperty("modifiedUserInteraction")
    public void setModifiedUserInteraction(CvssV3X.ModifiedUserInteractionType modifiedUserInteraction) {
        this.modifiedUserInteraction = modifiedUserInteraction;
    }

    @JsonProperty("modifiedScope")
    public CvssV3X.ModifiedScopeType getModifiedScope() {
        return modifiedScope;
    }

    @JsonProperty("modifiedScope")
    public void setModifiedScope(CvssV3X.ModifiedScopeType modifiedScope) {
        this.modifiedScope = modifiedScope;
    }

    @JsonProperty("modifiedConfidentialityImpact")
    public CvssV3X.ModifiedCiaType getModifiedConfidentialityImpact() {
        return modifiedConfidentialityImpact;
    }

    @JsonProperty("modifiedConfidentialityImpact")
    public void setModifiedConfidentialityImpact(CvssV3X.ModifiedCiaType modifiedConfidentialityImpact) {
        this.modifiedConfidentialityImpact = modifiedConfidentialityImpact;
    }

    @JsonProperty("modifiedIntegrityImpact")
    public CvssV3X.ModifiedCiaType getModifiedIntegrityImpact() {
        return modifiedIntegrityImpact;
    }

    @JsonProperty("modifiedIntegrityImpact")
    public void setModifiedIntegrityImpact(CvssV3X.ModifiedCiaType modifiedIntegrityImpact) {
        this.modifiedIntegrityImpact = modifiedIntegrityImpact;
    }

    @JsonProperty("modifiedAvailabilityImpact")
    public CvssV3X.ModifiedCiaType getModifiedAvailabilityImpact() {
        return modifiedAvailabilityImpact;
    }

    @JsonProperty("modifiedAvailabilityImpact")
    public void setModifiedAvailabilityImpact(CvssV3X.ModifiedCiaType modifiedAvailabilityImpact) {
        this.modifiedAvailabilityImpact = modifiedAvailabilityImpact;
    }

    @JsonProperty("environmentalScore")
    public Double getEnvironmentalScore() {
        return environmentalScore;
    }

    @JsonProperty("environmentalScore")
    public void setEnvironmentalScore(Double environmentalScore) {
        this.environmentalScore = environmentalScore;
    }

    @JsonProperty("environmentalSeverity")
    public CvssV3X.SeverityType getEnvironmentalSeverity() {
        return environmentalSeverity;
    }

    @JsonProperty("environmentalSeverity")
    public void setEnvironmentalSeverity(CvssV3X.SeverityType environmentalSeverity) {
        this.environmentalSeverity = environmentalSeverity;
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
        sb.append(CvssV3X.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("vectorString");
        sb.append('=');
        sb.append(((this.vectorString == null)?"<null>":this.vectorString));
        sb.append(',');
        sb.append("attackVector");
        sb.append('=');
        sb.append(((this.attackVector == null)?"<null>":this.attackVector));
        sb.append(',');
        sb.append("attackComplexity");
        sb.append('=');
        sb.append(((this.attackComplexity == null)?"<null>":this.attackComplexity));
        sb.append(',');
        sb.append("privilegesRequired");
        sb.append('=');
        sb.append(((this.privilegesRequired == null)?"<null>":this.privilegesRequired));
        sb.append(',');
        sb.append("userInteraction");
        sb.append('=');
        sb.append(((this.userInteraction == null)?"<null>":this.userInteraction));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
        sb.append(',');
        sb.append("confidentialityImpact");
        sb.append('=');
        sb.append(((this.confidentialityImpact == null)?"<null>":this.confidentialityImpact));
        sb.append(',');
        sb.append("integrityImpact");
        sb.append('=');
        sb.append(((this.integrityImpact == null)?"<null>":this.integrityImpact));
        sb.append(',');
        sb.append("availabilityImpact");
        sb.append('=');
        sb.append(((this.availabilityImpact == null)?"<null>":this.availabilityImpact));
        sb.append(',');
        sb.append("baseScore");
        sb.append('=');
        sb.append(((this.baseScore == null)?"<null>":this.baseScore));
        sb.append(',');
        sb.append("baseSeverity");
        sb.append('=');
        sb.append(((this.baseSeverity == null)?"<null>":this.baseSeverity));
        sb.append(',');
        sb.append("exploitCodeMaturity");
        sb.append('=');
        sb.append(((this.exploitCodeMaturity == null)?"<null>":this.exploitCodeMaturity));
        sb.append(',');
        sb.append("remediationLevel");
        sb.append('=');
        sb.append(((this.remediationLevel == null)?"<null>":this.remediationLevel));
        sb.append(',');
        sb.append("reportConfidence");
        sb.append('=');
        sb.append(((this.reportConfidence == null)?"<null>":this.reportConfidence));
        sb.append(',');
        sb.append("temporalScore");
        sb.append('=');
        sb.append(((this.temporalScore == null)?"<null>":this.temporalScore));
        sb.append(',');
        sb.append("temporalSeverity");
        sb.append('=');
        sb.append(((this.temporalSeverity == null)?"<null>":this.temporalSeverity));
        sb.append(',');
        sb.append("confidentialityRequirement");
        sb.append('=');
        sb.append(((this.confidentialityRequirement == null)?"<null>":this.confidentialityRequirement));
        sb.append(',');
        sb.append("integrityRequirement");
        sb.append('=');
        sb.append(((this.integrityRequirement == null)?"<null>":this.integrityRequirement));
        sb.append(',');
        sb.append("availabilityRequirement");
        sb.append('=');
        sb.append(((this.availabilityRequirement == null)?"<null>":this.availabilityRequirement));
        sb.append(',');
        sb.append("modifiedAttackVector");
        sb.append('=');
        sb.append(((this.modifiedAttackVector == null)?"<null>":this.modifiedAttackVector));
        sb.append(',');
        sb.append("modifiedAttackComplexity");
        sb.append('=');
        sb.append(((this.modifiedAttackComplexity == null)?"<null>":this.modifiedAttackComplexity));
        sb.append(',');
        sb.append("modifiedPrivilegesRequired");
        sb.append('=');
        sb.append(((this.modifiedPrivilegesRequired == null)?"<null>":this.modifiedPrivilegesRequired));
        sb.append(',');
        sb.append("modifiedUserInteraction");
        sb.append('=');
        sb.append(((this.modifiedUserInteraction == null)?"<null>":this.modifiedUserInteraction));
        sb.append(',');
        sb.append("modifiedScope");
        sb.append('=');
        sb.append(((this.modifiedScope == null)?"<null>":this.modifiedScope));
        sb.append(',');
        sb.append("modifiedConfidentialityImpact");
        sb.append('=');
        sb.append(((this.modifiedConfidentialityImpact == null)?"<null>":this.modifiedConfidentialityImpact));
        sb.append(',');
        sb.append("modifiedIntegrityImpact");
        sb.append('=');
        sb.append(((this.modifiedIntegrityImpact == null)?"<null>":this.modifiedIntegrityImpact));
        sb.append(',');
        sb.append("modifiedAvailabilityImpact");
        sb.append('=');
        sb.append(((this.modifiedAvailabilityImpact == null)?"<null>":this.modifiedAvailabilityImpact));
        sb.append(',');
        sb.append("environmentalScore");
        sb.append('=');
        sb.append(((this.environmentalScore == null)?"<null>":this.environmentalScore));
        sb.append(',');
        sb.append("environmentalSeverity");
        sb.append('=');
        sb.append(((this.environmentalSeverity == null)?"<null>":this.environmentalSeverity));
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
        result = ((result* 31)+((this.modifiedPrivilegesRequired == null)? 0 :this.modifiedPrivilegesRequired.hashCode()));
        result = ((result* 31)+((this.reportConfidence == null)? 0 :this.reportConfidence.hashCode()));
        result = ((result* 31)+((this.modifiedConfidentialityImpact == null)? 0 :this.modifiedConfidentialityImpact.hashCode()));
        result = ((result* 31)+((this.availabilityImpact == null)? 0 :this.availabilityImpact.hashCode()));
        result = ((result* 31)+((this.privilegesRequired == null)? 0 :this.privilegesRequired.hashCode()));
        result = ((result* 31)+((this.baseScore == null)? 0 :this.baseScore.hashCode()));
        result = ((result* 31)+((this.temporalSeverity == null)? 0 :this.temporalSeverity.hashCode()));
        result = ((result* 31)+((this.userInteraction == null)? 0 :this.userInteraction.hashCode()));
        result = ((result* 31)+((this.integrityRequirement == null)? 0 :this.integrityRequirement.hashCode()));
        result = ((result* 31)+((this.modifiedAvailabilityImpact == null)? 0 :this.modifiedAvailabilityImpact.hashCode()));
        result = ((result* 31)+((this.availabilityRequirement == null)? 0 :this.availabilityRequirement.hashCode()));
        result = ((result* 31)+((this.modifiedScope == null)? 0 :this.modifiedScope.hashCode()));
        result = ((result* 31)+((this.attackComplexity == null)? 0 :this.attackComplexity.hashCode()));
        result = ((result* 31)+((this.scope == null)? 0 :this.scope.hashCode()));
        result = ((result* 31)+((this.attackVector == null)? 0 :this.attackVector.hashCode()));
        result = ((result* 31)+((this.integrityImpact == null)? 0 :this.integrityImpact.hashCode()));
        result = ((result* 31)+((this.modifiedIntegrityImpact == null)? 0 :this.modifiedIntegrityImpact.hashCode()));
        result = ((result* 31)+((this.vectorString == null)? 0 :this.vectorString.hashCode()));
        result = ((result* 31)+((this.exploitCodeMaturity == null)? 0 :this.exploitCodeMaturity.hashCode()));
        result = ((result* 31)+((this.temporalScore == null)? 0 :this.temporalScore.hashCode()));
        result = ((result* 31)+((this.modifiedAttackVector == null)? 0 :this.modifiedAttackVector.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.confidentialityRequirement == null)? 0 :this.confidentialityRequirement.hashCode()));
        result = ((result* 31)+((this.remediationLevel == null)? 0 :this.remediationLevel.hashCode()));
        result = ((result* 31)+((this.modifiedUserInteraction == null)? 0 :this.modifiedUserInteraction.hashCode()));
        result = ((result* 31)+((this.modifiedAttackComplexity == null)? 0 :this.modifiedAttackComplexity.hashCode()));
        result = ((result* 31)+((this.baseSeverity == null)? 0 :this.baseSeverity.hashCode()));
        result = ((result* 31)+((this.confidentialityImpact == null)? 0 :this.confidentialityImpact.hashCode()));
        result = ((result* 31)+((this.environmentalScore == null)? 0 :this.environmentalScore.hashCode()));
        result = ((result* 31)+((this.environmentalSeverity == null)? 0 :this.environmentalSeverity.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CvssV3X) == false) {
            return false;
        }
        CvssV3X rhs = ((CvssV3X) other);
        return ((((((((((((((((((((((((((((((((this.modifiedPrivilegesRequired == rhs.modifiedPrivilegesRequired)||((this.modifiedPrivilegesRequired!= null)&&this.modifiedPrivilegesRequired.equals(rhs.modifiedPrivilegesRequired)))&&((this.reportConfidence == rhs.reportConfidence)||((this.reportConfidence!= null)&&this.reportConfidence.equals(rhs.reportConfidence))))&&((this.modifiedConfidentialityImpact == rhs.modifiedConfidentialityImpact)||((this.modifiedConfidentialityImpact!= null)&&this.modifiedConfidentialityImpact.equals(rhs.modifiedConfidentialityImpact))))&&((this.availabilityImpact == rhs.availabilityImpact)||((this.availabilityImpact!= null)&&this.availabilityImpact.equals(rhs.availabilityImpact))))&&((this.privilegesRequired == rhs.privilegesRequired)||((this.privilegesRequired!= null)&&this.privilegesRequired.equals(rhs.privilegesRequired))))&&((this.baseScore == rhs.baseScore)||((this.baseScore!= null)&&this.baseScore.equals(rhs.baseScore))))&&((this.temporalSeverity == rhs.temporalSeverity)||((this.temporalSeverity!= null)&&this.temporalSeverity.equals(rhs.temporalSeverity))))&&((this.userInteraction == rhs.userInteraction)||((this.userInteraction!= null)&&this.userInteraction.equals(rhs.userInteraction))))&&((this.integrityRequirement == rhs.integrityRequirement)||((this.integrityRequirement!= null)&&this.integrityRequirement.equals(rhs.integrityRequirement))))&&((this.modifiedAvailabilityImpact == rhs.modifiedAvailabilityImpact)||((this.modifiedAvailabilityImpact!= null)&&this.modifiedAvailabilityImpact.equals(rhs.modifiedAvailabilityImpact))))&&((this.availabilityRequirement == rhs.availabilityRequirement)||((this.availabilityRequirement!= null)&&this.availabilityRequirement.equals(rhs.availabilityRequirement))))&&((this.modifiedScope == rhs.modifiedScope)||((this.modifiedScope!= null)&&this.modifiedScope.equals(rhs.modifiedScope))))&&((this.attackComplexity == rhs.attackComplexity)||((this.attackComplexity!= null)&&this.attackComplexity.equals(rhs.attackComplexity))))&&((this.scope == rhs.scope)||((this.scope!= null)&&this.scope.equals(rhs.scope))))&&((this.attackVector == rhs.attackVector)||((this.attackVector!= null)&&this.attackVector.equals(rhs.attackVector))))&&((this.integrityImpact == rhs.integrityImpact)||((this.integrityImpact!= null)&&this.integrityImpact.equals(rhs.integrityImpact))))&&((this.modifiedIntegrityImpact == rhs.modifiedIntegrityImpact)||((this.modifiedIntegrityImpact!= null)&&this.modifiedIntegrityImpact.equals(rhs.modifiedIntegrityImpact))))&&((this.vectorString == rhs.vectorString)||((this.vectorString!= null)&&this.vectorString.equals(rhs.vectorString))))&&((this.exploitCodeMaturity == rhs.exploitCodeMaturity)||((this.exploitCodeMaturity!= null)&&this.exploitCodeMaturity.equals(rhs.exploitCodeMaturity))))&&((this.temporalScore == rhs.temporalScore)||((this.temporalScore!= null)&&this.temporalScore.equals(rhs.temporalScore))))&&((this.modifiedAttackVector == rhs.modifiedAttackVector)||((this.modifiedAttackVector!= null)&&this.modifiedAttackVector.equals(rhs.modifiedAttackVector))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.confidentialityRequirement == rhs.confidentialityRequirement)||((this.confidentialityRequirement!= null)&&this.confidentialityRequirement.equals(rhs.confidentialityRequirement))))&&((this.remediationLevel == rhs.remediationLevel)||((this.remediationLevel!= null)&&this.remediationLevel.equals(rhs.remediationLevel))))&&((this.modifiedUserInteraction == rhs.modifiedUserInteraction)||((this.modifiedUserInteraction!= null)&&this.modifiedUserInteraction.equals(rhs.modifiedUserInteraction))))&&((this.modifiedAttackComplexity == rhs.modifiedAttackComplexity)||((this.modifiedAttackComplexity!= null)&&this.modifiedAttackComplexity.equals(rhs.modifiedAttackComplexity))))&&((this.baseSeverity == rhs.baseSeverity)||((this.baseSeverity!= null)&&this.baseSeverity.equals(rhs.baseSeverity))))&&((this.confidentialityImpact == rhs.confidentialityImpact)||((this.confidentialityImpact!= null)&&this.confidentialityImpact.equals(rhs.confidentialityImpact))))&&((this.environmentalScore == rhs.environmentalScore)||((this.environmentalScore!= null)&&this.environmentalScore.equals(rhs.environmentalScore))))&&((this.environmentalSeverity == rhs.environmentalSeverity)||((this.environmentalSeverity!= null)&&this.environmentalSeverity.equals(rhs.environmentalSeverity))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public enum AttackComplexityType {

        HIGH("HIGH"),
        LOW("LOW");
        private final String value;
        private final static Map<String, CvssV3X.AttackComplexityType> CONSTANTS = new HashMap<String, CvssV3X.AttackComplexityType>();

        static {
            for (CvssV3X.AttackComplexityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AttackComplexityType(String value) {
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
        public static CvssV3X.AttackComplexityType fromValue(String value) {
            CvssV3X.AttackComplexityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum AttackVectorType {

        NETWORK("NETWORK"),
        ADJACENT_NETWORK("ADJACENT_NETWORK"),
        LOCAL("LOCAL"),
        PHYSICAL("PHYSICAL");
        private final String value;
        private final static Map<String, CvssV3X.AttackVectorType> CONSTANTS = new HashMap<String, CvssV3X.AttackVectorType>();

        static {
            for (CvssV3X.AttackVectorType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AttackVectorType(String value) {
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
        public static CvssV3X.AttackVectorType fromValue(String value) {
            CvssV3X.AttackVectorType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum CiaRequirementType {

        LOW("LOW"),
        MEDIUM("MEDIUM"),
        HIGH("HIGH"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV3X.CiaRequirementType> CONSTANTS = new HashMap<String, CvssV3X.CiaRequirementType>();

        static {
            for (CvssV3X.CiaRequirementType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CiaRequirementType(String value) {
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
        public static CvssV3X.CiaRequirementType fromValue(String value) {
            CvssV3X.CiaRequirementType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum CiaType {

        NONE("NONE"),
        LOW("LOW"),
        HIGH("HIGH");
        private final String value;
        private final static Map<String, CvssV3X.CiaType> CONSTANTS = new HashMap<String, CvssV3X.CiaType>();

        static {
            for (CvssV3X.CiaType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CiaType(String value) {
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
        public static CvssV3X.CiaType fromValue(String value) {
            CvssV3X.CiaType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ConfidenceType {

        UNKNOWN("UNKNOWN"),
        REASONABLE("REASONABLE"),
        CONFIRMED("CONFIRMED"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV3X.ConfidenceType> CONSTANTS = new HashMap<String, CvssV3X.ConfidenceType>();

        static {
            for (CvssV3X.ConfidenceType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ConfidenceType(String value) {
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
        public static CvssV3X.ConfidenceType fromValue(String value) {
            CvssV3X.ConfidenceType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ExploitCodeMaturityType {

        UNPROVEN("UNPROVEN"),
        PROOF_OF_CONCEPT("PROOF_OF_CONCEPT"),
        FUNCTIONAL("FUNCTIONAL"),
        HIGH("HIGH"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV3X.ExploitCodeMaturityType> CONSTANTS = new HashMap<String, CvssV3X.ExploitCodeMaturityType>();

        static {
            for (CvssV3X.ExploitCodeMaturityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ExploitCodeMaturityType(String value) {
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
        public static CvssV3X.ExploitCodeMaturityType fromValue(String value) {
            CvssV3X.ExploitCodeMaturityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ModifiedAttackComplexityType {

        HIGH("HIGH"),
        LOW("LOW"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV3X.ModifiedAttackComplexityType> CONSTANTS = new HashMap<String, CvssV3X.ModifiedAttackComplexityType>();

        static {
            for (CvssV3X.ModifiedAttackComplexityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ModifiedAttackComplexityType(String value) {
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
        public static CvssV3X.ModifiedAttackComplexityType fromValue(String value) {
            CvssV3X.ModifiedAttackComplexityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ModifiedAttackVectorType {

        NETWORK("NETWORK"),
        ADJACENT_NETWORK("ADJACENT_NETWORK"),
        LOCAL("LOCAL"),
        PHYSICAL("PHYSICAL"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV3X.ModifiedAttackVectorType> CONSTANTS = new HashMap<String, CvssV3X.ModifiedAttackVectorType>();

        static {
            for (CvssV3X.ModifiedAttackVectorType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ModifiedAttackVectorType(String value) {
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
        public static CvssV3X.ModifiedAttackVectorType fromValue(String value) {
            CvssV3X.ModifiedAttackVectorType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ModifiedCiaType {

        NONE("NONE"),
        LOW("LOW"),
        HIGH("HIGH"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV3X.ModifiedCiaType> CONSTANTS = new HashMap<String, CvssV3X.ModifiedCiaType>();

        static {
            for (CvssV3X.ModifiedCiaType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ModifiedCiaType(String value) {
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
        public static CvssV3X.ModifiedCiaType fromValue(String value) {
            CvssV3X.ModifiedCiaType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ModifiedPrivilegesRequiredType {

        HIGH("HIGH"),
        LOW("LOW"),
        NONE("NONE"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV3X.ModifiedPrivilegesRequiredType> CONSTANTS = new HashMap<String, CvssV3X.ModifiedPrivilegesRequiredType>();

        static {
            for (CvssV3X.ModifiedPrivilegesRequiredType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ModifiedPrivilegesRequiredType(String value) {
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
        public static CvssV3X.ModifiedPrivilegesRequiredType fromValue(String value) {
            CvssV3X.ModifiedPrivilegesRequiredType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ModifiedScopeType {

        UNCHANGED("UNCHANGED"),
        CHANGED("CHANGED"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV3X.ModifiedScopeType> CONSTANTS = new HashMap<String, CvssV3X.ModifiedScopeType>();

        static {
            for (CvssV3X.ModifiedScopeType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ModifiedScopeType(String value) {
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
        public static CvssV3X.ModifiedScopeType fromValue(String value) {
            CvssV3X.ModifiedScopeType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ModifiedUserInteractionType {

        NONE("NONE"),
        REQUIRED("REQUIRED"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV3X.ModifiedUserInteractionType> CONSTANTS = new HashMap<String, CvssV3X.ModifiedUserInteractionType>();

        static {
            for (CvssV3X.ModifiedUserInteractionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ModifiedUserInteractionType(String value) {
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
        public static CvssV3X.ModifiedUserInteractionType fromValue(String value) {
            CvssV3X.ModifiedUserInteractionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum PrivilegesRequiredType {

        HIGH("HIGH"),
        LOW("LOW"),
        NONE("NONE");
        private final String value;
        private final static Map<String, CvssV3X.PrivilegesRequiredType> CONSTANTS = new HashMap<String, CvssV3X.PrivilegesRequiredType>();

        static {
            for (CvssV3X.PrivilegesRequiredType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PrivilegesRequiredType(String value) {
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
        public static CvssV3X.PrivilegesRequiredType fromValue(String value) {
            CvssV3X.PrivilegesRequiredType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum RemediationLevelType {

        OFFICIAL_FIX("OFFICIAL_FIX"),
        TEMPORARY_FIX("TEMPORARY_FIX"),
        WORKAROUND("WORKAROUND"),
        UNAVAILABLE("UNAVAILABLE"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV3X.RemediationLevelType> CONSTANTS = new HashMap<String, CvssV3X.RemediationLevelType>();

        static {
            for (CvssV3X.RemediationLevelType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RemediationLevelType(String value) {
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
        public static CvssV3X.RemediationLevelType fromValue(String value) {
            CvssV3X.RemediationLevelType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ScopeType {

        UNCHANGED("UNCHANGED"),
        CHANGED("CHANGED");
        private final String value;
        private final static Map<String, CvssV3X.ScopeType> CONSTANTS = new HashMap<String, CvssV3X.ScopeType>();

        static {
            for (CvssV3X.ScopeType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ScopeType(String value) {
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
        public static CvssV3X.ScopeType fromValue(String value) {
            CvssV3X.ScopeType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum SeverityType {

        NONE("NONE"),
        LOW("LOW"),
        MEDIUM("MEDIUM"),
        HIGH("HIGH"),
        CRITICAL("CRITICAL");
        private final String value;
        private final static Map<String, CvssV3X.SeverityType> CONSTANTS = new HashMap<String, CvssV3X.SeverityType>();

        static {
            for (CvssV3X.SeverityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SeverityType(String value) {
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
        public static CvssV3X.SeverityType fromValue(String value) {
            CvssV3X.SeverityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum UserInteractionType {

        NONE("NONE"),
        REQUIRED("REQUIRED");
        private final String value;
        private final static Map<String, CvssV3X.UserInteractionType> CONSTANTS = new HashMap<String, CvssV3X.UserInteractionType>();

        static {
            for (CvssV3X.UserInteractionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        UserInteractionType(String value) {
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
        public static CvssV3X.UserInteractionType fromValue(String value) {
            CvssV3X.UserInteractionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * CVSS Version
     * 
     */
    public enum Version {

        _3_0("3.0"),
        _3_1("3.1");
        private final String value;
        private final static Map<String, CvssV3X.Version> CONSTANTS = new HashMap<String, CvssV3X.Version>();

        static {
            for (CvssV3X.Version c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Version(String value) {
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
        public static CvssV3X.Version fromValue(String value) {
            CvssV3X.Version constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
