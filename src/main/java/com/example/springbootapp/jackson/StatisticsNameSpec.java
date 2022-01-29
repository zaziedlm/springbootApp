
package com.example.springbootapp.jackson;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TABULATION_CATEGORY"
})
@Generated("jsonschema2pojo")
public class StatisticsNameSpec {

    @JsonProperty("TABULATION_CATEGORY")
    private String tabulationCategory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TABULATION_CATEGORY")
    public String getTabulationCategory() {
        return tabulationCategory;
    }

    @JsonProperty("TABULATION_CATEGORY")
    public void setTabulationCategory(String tabulationCategory) {
        this.tabulationCategory = tabulationCategory;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
