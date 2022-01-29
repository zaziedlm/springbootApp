
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
    "@char",
    "$"
})
@Generated("jsonschema2pojo")
public class Note {

    @JsonProperty("@char")
    private String _char;
    @JsonProperty("$")
    private String $;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@char")
    public String getChar() {
        return _char;
    }

    @JsonProperty("@char")
    public void setChar(String _char) {
        this._char = _char;
    }

    @JsonProperty("$")
    public String get$() {
        return $;
    }

    @JsonProperty("$")
    public void set$(String $) {
        this.$ = $;
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
