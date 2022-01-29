
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
    "NOTE",
    "VALUE"
})
@Generated("jsonschema2pojo")
public class DataInf {

    @JsonProperty("NOTE")
    private Note note;
    @JsonProperty("VALUE")
    private List<Value> value = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("NOTE")
    public Note getNote() {
        return note;
    }

    @JsonProperty("NOTE")
    public void setNote(Note note) {
        this.note = note;
    }

    @JsonProperty("VALUE")
    public List<Value> getValue() {
        return value;
    }

    @JsonProperty("VALUE")
    public void setValue(List<Value> value) {
        this.value = value;
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
