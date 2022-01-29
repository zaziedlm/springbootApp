
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
    "TABLE_CATEGORY",
    "TABLE_NAME"
})
@Generated("jsonschema2pojo")
public class TitleSpec {

    @JsonProperty("TABLE_CATEGORY")
    private String tableCategory;
    @JsonProperty("TABLE_NAME")
    private String tableName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TABLE_CATEGORY")
    public String getTableCategory() {
        return tableCategory;
    }

    @JsonProperty("TABLE_CATEGORY")
    public void setTableCategory(String tableCategory) {
        this.tableCategory = tableCategory;
    }

    @JsonProperty("TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @JsonProperty("TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
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
