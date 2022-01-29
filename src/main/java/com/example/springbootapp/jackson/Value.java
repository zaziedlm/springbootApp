
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
    "@tab",
    "@cat01",
    "@cat02",
    "@cat03",
    "@cat04",
    "@cat05",
    "@cat06",
    "@time",
    "@unit",
    "$"
})
@Generated("jsonschema2pojo")
public class Value {

    @JsonProperty("@tab")
    private String tab;
    @JsonProperty("@cat01")
    private String cat01;
    @JsonProperty("@cat02")
    private String cat02;
    @JsonProperty("@cat03")
    private String cat03;
    @JsonProperty("@cat04")
    private String cat04;
    @JsonProperty("@cat05")
    private String cat05;
    @JsonProperty("@cat06")
    private String cat06;
    @JsonProperty("@time")
    private String time;
    @JsonProperty("@unit")
    private String unit;
    @JsonProperty("$")
    private String $;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@tab")
    public String getTab() {
        return tab;
    }

    @JsonProperty("@tab")
    public void setTab(String tab) {
        this.tab = tab;
    }

    @JsonProperty("@cat01")
    public String getCat01() {
        return cat01;
    }

    @JsonProperty("@cat01")
    public void setCat01(String cat01) {
        this.cat01 = cat01;
    }

    @JsonProperty("@cat02")
    public String getCat02() {
        return cat02;
    }

    @JsonProperty("@cat02")
    public void setCat02(String cat02) {
        this.cat02 = cat02;
    }

    @JsonProperty("@cat03")
    public String getCat03() {
        return cat03;
    }

    @JsonProperty("@cat03")
    public void setCat03(String cat03) {
        this.cat03 = cat03;
    }

    @JsonProperty("@cat04")
    public String getCat04() {
        return cat04;
    }

    @JsonProperty("@cat04")
    public void setCat04(String cat04) {
        this.cat04 = cat04;
    }

    @JsonProperty("@cat05")
    public String getCat05() {
        return cat05;
    }

    @JsonProperty("@cat05")
    public void setCat05(String cat05) {
        this.cat05 = cat05;
    }

    @JsonProperty("@cat06")
    public String getCat06() {
        return cat06;
    }

    @JsonProperty("@cat06")
    public void setCat06(String cat06) {
        this.cat06 = cat06;
    }

    @JsonProperty("@time")
    public String getTime() {
        return time;
    }

    @JsonProperty("@time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("@unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("@unit")
    public void setUnit(String unit) {
        this.unit = unit;
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
