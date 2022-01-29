
package com.example.springbootapp.jackson;

import java.util.HashMap;
import java.util.List;
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
    "CLASS_OBJ"
})
@Generated("jsonschema2pojo")
public class ClassInf {

    @JsonProperty("CLASS_OBJ")
    private List<ClassObj> classObj = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CLASS_OBJ")
    public List<ClassObj> getClassObj() {
        return classObj;
    }

    @JsonProperty("CLASS_OBJ")
    public void setClassObj(List<ClassObj> classObj) {
        this.classObj = classObj;
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
