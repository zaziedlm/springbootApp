
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
    "@code",
    "@name",
    "@level",
    "@parentCode"
})
@Generated("jsonschema2pojo")
public class Class {

    @JsonProperty("@code")
    private String code;
    @JsonProperty("@name")
    private String name;
    @JsonProperty("@level")
    private String level;
    @JsonProperty("@parentCode")
    private String parentCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@code")
    public String getCode() {
        return code;
    }

    @JsonProperty("@code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("@name")
    public String getName() {
        return name;
    }

    @JsonProperty("@name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("@level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("@level")
    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("@parentCode")
    public String getParentCode() {
        return parentCode;
    }

    @JsonProperty("@parentCode")
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
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
