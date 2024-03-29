
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
    "@id",
    "@name",
    "CLASS"
})
@Generated("jsonschema2pojo")
public class ClassObj {

    @JsonProperty("@id")
    private String id;
    @JsonProperty("@name")
    private String name;
    @JsonProperty("CLASS")
    private Class _class;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@id")
    public String getId() {
        return id;
    }

    @JsonProperty("@id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("@name")
    public String getName() {
        return name;
    }

    @JsonProperty("@name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("CLASS")
    public Class getClass_() {
        return _class;
    }

    @JsonProperty("CLASS")
    public void setClass_(Class _class) {
        this._class = _class;
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
