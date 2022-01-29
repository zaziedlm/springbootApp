
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
    "RESULT_INF",
    "TABLE_INF",
    //"CLASS_INF",
    "DATA_INF"
})
@Generated("jsonschema2pojo")
public class StatisticalData {

    @JsonProperty("RESULT_INF")
    private ResultInf resultInf;
    @JsonProperty("TABLE_INF")
    private TableInf tableInf;
    //@JsonProperty("CLASS_INF")
    //private ClassInf classInf;
    @JsonProperty("DATA_INF")
    private DataInf dataInf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("RESULT_INF")
    public ResultInf getResultInf() {
        return resultInf;
    }

    @JsonProperty("RESULT_INF")
    public void setResultInf(ResultInf resultInf) {
        this.resultInf = resultInf;
    }

    @JsonProperty("TABLE_INF")
    public TableInf getTableInf() {
        return tableInf;
    }

    @JsonProperty("TABLE_INF")
    public void setTableInf(TableInf tableInf) {
        this.tableInf = tableInf;
    }

    // @JsonProperty("CLASS_INF")
    // public ClassInf getClassInf() {
    //     return classInf;
    // }

    // @JsonProperty("CLASS_INF")
    // public void setClassInf(ClassInf classInf) {
    //     this.classInf = classInf;
    // }

    @JsonProperty("DATA_INF")
    public DataInf getDataInf() {
        return dataInf;
    }

    @JsonProperty("DATA_INF")
    public void setDataInf(DataInf dataInf) {
        this.dataInf = dataInf;
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
