
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
    "CODE_TAB_SELECT",
    "CODE_CAT01_SELECT",
    "CODE_CAT02_SELECT",
    "CODE_CAT03_SELECT",
    "CODE_CAT04_SELECT",
    "CODE_CAT05_SELECT",
    "CODE_CAT06_SELECT"
})
@Generated("jsonschema2pojo")
public class NarrowingCond {

    @JsonProperty("CODE_TAB_SELECT")
    private String codeTabSelect;
    @JsonProperty("CODE_CAT01_SELECT")
    private String codeCat01Select;
    @JsonProperty("CODE_CAT02_SELECT")
    private String codeCat02Select;
    @JsonProperty("CODE_CAT03_SELECT")
    private String codeCat03Select;
    @JsonProperty("CODE_CAT04_SELECT")
    private String codeCat04Select;
    @JsonProperty("CODE_CAT05_SELECT")
    private String codeCat05Select;
    @JsonProperty("CODE_CAT06_SELECT")
    private String codeCat06Select;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CODE_TAB_SELECT")
    public String getCodeTabSelect() {
        return codeTabSelect;
    }

    @JsonProperty("CODE_TAB_SELECT")
    public void setCodeTabSelect(String codeTabSelect) {
        this.codeTabSelect = codeTabSelect;
    }

    @JsonProperty("CODE_CAT01_SELECT")
    public String getCodeCat01Select() {
        return codeCat01Select;
    }

    @JsonProperty("CODE_CAT01_SELECT")
    public void setCodeCat01Select(String codeCat01Select) {
        this.codeCat01Select = codeCat01Select;
    }

    @JsonProperty("CODE_CAT02_SELECT")
    public String getCodeCat02Select() {
        return codeCat02Select;
    }

    @JsonProperty("CODE_CAT02_SELECT")
    public void setCodeCat02Select(String codeCat02Select) {
        this.codeCat02Select = codeCat02Select;
    }

    @JsonProperty("CODE_CAT03_SELECT")
    public String getCodeCat03Select() {
        return codeCat03Select;
    }

    @JsonProperty("CODE_CAT03_SELECT")
    public void setCodeCat03Select(String codeCat03Select) {
        this.codeCat03Select = codeCat03Select;
    }

    @JsonProperty("CODE_CAT04_SELECT")
    public String getCodeCat04Select() {
        return codeCat04Select;
    }

    @JsonProperty("CODE_CAT04_SELECT")
    public void setCodeCat04Select(String codeCat04Select) {
        this.codeCat04Select = codeCat04Select;
    }

    @JsonProperty("CODE_CAT05_SELECT")
    public String getCodeCat05Select() {
        return codeCat05Select;
    }

    @JsonProperty("CODE_CAT05_SELECT")
    public void setCodeCat05Select(String codeCat05Select) {
        this.codeCat05Select = codeCat05Select;
    }

    @JsonProperty("CODE_CAT06_SELECT")
    public String getCodeCat06Select() {
        return codeCat06Select;
    }

    @JsonProperty("CODE_CAT06_SELECT")
    public void setCodeCat06Select(String codeCat06Select) {
        this.codeCat06Select = codeCat06Select;
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
