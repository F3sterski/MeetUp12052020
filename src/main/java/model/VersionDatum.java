
package model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version_value",
    "version_affected"
})
public class VersionDatum {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_value")
    private String versionValue;
    @JsonProperty("version_affected")
    private String versionAffected;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_value")
    public String getVersionValue() {
        return versionValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_value")
    public void setVersionValue(String versionValue) {
        this.versionValue = versionValue;
    }

    @JsonProperty("version_affected")
    public String getVersionAffected() {
        return versionAffected;
    }

    @JsonProperty("version_affected")
    public void setVersionAffected(String versionAffected) {
        this.versionAffected = versionAffected;
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
        sb.append(VersionDatum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("versionValue");
        sb.append('=');
        sb.append(((this.versionValue == null)?"<null>":this.versionValue));
        sb.append(',');
        sb.append("versionAffected");
        sb.append('=');
        sb.append(((this.versionAffected == null)?"<null>":this.versionAffected));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.versionValue == null)? 0 :this.versionValue.hashCode()));
        result = ((result* 31)+((this.versionAffected == null)? 0 :this.versionAffected.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersionDatum) == false) {
            return false;
        }
        VersionDatum rhs = ((VersionDatum) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.versionValue == rhs.versionValue)||((this.versionValue!= null)&&this.versionValue.equals(rhs.versionValue))))&&((this.versionAffected == rhs.versionAffected)||((this.versionAffected!= null)&&this.versionAffected.equals(rhs.versionAffected))));
    }

}
