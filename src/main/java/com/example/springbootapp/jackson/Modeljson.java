
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
    "GET_STATS_DATA"
})
@Generated("jsonschema2pojo")
public class Modeljson {

    @JsonProperty("GET_STATS_DATA")
    private GetStatsData getStatsData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GET_STATS_DATA")
    public GetStatsData getGetStatsData() {
        return getStatsData;
    }

    @JsonProperty("GET_STATS_DATA")
    public void setGetStatsData(GetStatsData getStatsData) {
        this.getStatsData = getStatsData;
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
