
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
    "TOTAL_NUMBER",
    "FROM_NUMBER",
    "TO_NUMBER"
})
@Generated("jsonschema2pojo")
public class ResultInf {

    @JsonProperty("TOTAL_NUMBER")
    private Integer totalNumber;
    @JsonProperty("FROM_NUMBER")
    private Integer fromNumber;
    @JsonProperty("TO_NUMBER")
    private Integer toNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TOTAL_NUMBER")
    public Integer getTotalNumber() {
        return totalNumber;
    }

    @JsonProperty("TOTAL_NUMBER")
    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    @JsonProperty("FROM_NUMBER")
    public Integer getFromNumber() {
        return fromNumber;
    }

    @JsonProperty("FROM_NUMBER")
    public void setFromNumber(Integer fromNumber) {
        this.fromNumber = fromNumber;
    }

    @JsonProperty("TO_NUMBER")
    public Integer getToNumber() {
        return toNumber;
    }

    @JsonProperty("TO_NUMBER")
    public void setToNumber(Integer toNumber) {
        this.toNumber = toNumber;
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
