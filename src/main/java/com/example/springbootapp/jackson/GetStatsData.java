
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
    "RESULT",
    "PARAMETER",
    "STATISTICAL_DATA"
})
@Generated("jsonschema2pojo")
public class GetStatsData {

    @JsonProperty("RESULT")
    private Result result;
    @JsonProperty("PARAMETER")
    private Parameter parameter;
    @JsonProperty("STATISTICAL_DATA")
    private StatisticalData statisticalData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("RESULT")
    public Result getResult() {
        return result;
    }

    @JsonProperty("RESULT")
    public void setResult(Result result) {
        this.result = result;
    }

    @JsonProperty("PARAMETER")
    public Parameter getParameter() {
        return parameter;
    }

    @JsonProperty("PARAMETER")
    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    @JsonProperty("STATISTICAL_DATA")
    public StatisticalData getStatisticalData() {
        return statisticalData;
    }

    @JsonProperty("STATISTICAL_DATA")
    public void setStatisticalData(StatisticalData statisticalData) {
        this.statisticalData = statisticalData;
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
