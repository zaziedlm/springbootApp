
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
    "STATUS",
    "ERROR_MSG",
    "DATE"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("STATUS")
    private Integer status;
    @JsonProperty("ERROR_MSG")
    private String errorMsg;
    @JsonProperty("DATE")
    private String date;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("STATUS")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("STATUS")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("ERROR_MSG")
    public String getErrorMsg() {
        return errorMsg;
    }

    @JsonProperty("ERROR_MSG")
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @JsonProperty("DATE")
    public String getDate() {
        return date;
    }

    @JsonProperty("DATE")
    public void setDate(String date) {
        this.date = date;
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
