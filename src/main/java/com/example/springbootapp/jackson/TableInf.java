
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
    "STAT_NAME",
    "GOV_ORG",
    "STATISTICS_NAME",
    "TITLE",
    "CYCLE",
    "SURVEY_DATE",
    "OPEN_DATE",
    "SMALL_AREA",
    "COLLECT_AREA",
    "MAIN_CATEGORY",
    "SUB_CATEGORY",
    "OVERALL_TOTAL_NUMBER",
    "UPDATED_DATE",
    "STATISTICS_NAME_SPEC",
    "DESCRIPTION",
    "TITLE_SPEC"
})
@Generated("jsonschema2pojo")
public class TableInf {

    @JsonProperty("@id")
    private String id;
    @JsonProperty("STAT_NAME")
    private StatName statName;
    @JsonProperty("GOV_ORG")
    private GovOrg govOrg;
    @JsonProperty("STATISTICS_NAME")
    private String statisticsName;
    @JsonProperty("TITLE")
    private String title;
    @JsonProperty("CYCLE")
    private String cycle;
    @JsonProperty("SURVEY_DATE")
    private Integer surveyDate;
    @JsonProperty("OPEN_DATE")
    private String openDate;
    @JsonProperty("SMALL_AREA")
    private Integer smallArea;
    @JsonProperty("COLLECT_AREA")
    private String collectArea;
    @JsonProperty("MAIN_CATEGORY")
    private MainCategory mainCategory;
    @JsonProperty("SUB_CATEGORY")
    private SubCategory subCategory;
    @JsonProperty("OVERALL_TOTAL_NUMBER")
    private Integer overallTotalNumber;
    @JsonProperty("UPDATED_DATE")
    private String updatedDate;
    @JsonProperty("STATISTICS_NAME_SPEC")
    private StatisticsNameSpec statisticsNameSpec;
    @JsonProperty("DESCRIPTION")
    private String description;
    @JsonProperty("TITLE_SPEC")
    private TitleSpec titleSpec;
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

    @JsonProperty("STAT_NAME")
    public StatName getStatName() {
        return statName;
    }

    @JsonProperty("STAT_NAME")
    public void setStatName(StatName statName) {
        this.statName = statName;
    }

    @JsonProperty("GOV_ORG")
    public GovOrg getGovOrg() {
        return govOrg;
    }

    @JsonProperty("GOV_ORG")
    public void setGovOrg(GovOrg govOrg) {
        this.govOrg = govOrg;
    }

    @JsonProperty("STATISTICS_NAME")
    public String getStatisticsName() {
        return statisticsName;
    }

    @JsonProperty("STATISTICS_NAME")
    public void setStatisticsName(String statisticsName) {
        this.statisticsName = statisticsName;
    }

    @JsonProperty("TITLE")
    public String getTitle() {
        return title;
    }

    @JsonProperty("TITLE")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("CYCLE")
    public String getCycle() {
        return cycle;
    }

    @JsonProperty("CYCLE")
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    @JsonProperty("SURVEY_DATE")
    public Integer getSurveyDate() {
        return surveyDate;
    }

    @JsonProperty("SURVEY_DATE")
    public void setSurveyDate(Integer surveyDate) {
        this.surveyDate = surveyDate;
    }

    @JsonProperty("OPEN_DATE")
    public String getOpenDate() {
        return openDate;
    }

    @JsonProperty("OPEN_DATE")
    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    @JsonProperty("SMALL_AREA")
    public Integer getSmallArea() {
        return smallArea;
    }

    @JsonProperty("SMALL_AREA")
    public void setSmallArea(Integer smallArea) {
        this.smallArea = smallArea;
    }

    @JsonProperty("COLLECT_AREA")
    public String getCollectArea() {
        return collectArea;
    }

    @JsonProperty("COLLECT_AREA")
    public void setCollectArea(String collectArea) {
        this.collectArea = collectArea;
    }

    @JsonProperty("MAIN_CATEGORY")
    public MainCategory getMainCategory() {
        return mainCategory;
    }

    @JsonProperty("MAIN_CATEGORY")
    public void setMainCategory(MainCategory mainCategory) {
        this.mainCategory = mainCategory;
    }

    @JsonProperty("SUB_CATEGORY")
    public SubCategory getSubCategory() {
        return subCategory;
    }

    @JsonProperty("SUB_CATEGORY")
    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    @JsonProperty("OVERALL_TOTAL_NUMBER")
    public Integer getOverallTotalNumber() {
        return overallTotalNumber;
    }

    @JsonProperty("OVERALL_TOTAL_NUMBER")
    public void setOverallTotalNumber(Integer overallTotalNumber) {
        this.overallTotalNumber = overallTotalNumber;
    }

    @JsonProperty("UPDATED_DATE")
    public String getUpdatedDate() {
        return updatedDate;
    }

    @JsonProperty("UPDATED_DATE")
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    @JsonProperty("STATISTICS_NAME_SPEC")
    public StatisticsNameSpec getStatisticsNameSpec() {
        return statisticsNameSpec;
    }

    @JsonProperty("STATISTICS_NAME_SPEC")
    public void setStatisticsNameSpec(StatisticsNameSpec statisticsNameSpec) {
        this.statisticsNameSpec = statisticsNameSpec;
    }

    @JsonProperty("DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @JsonProperty("DESCRIPTION")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("TITLE_SPEC")
    public TitleSpec getTitleSpec() {
        return titleSpec;
    }

    @JsonProperty("TITLE_SPEC")
    public void setTitleSpec(TitleSpec titleSpec) {
        this.titleSpec = titleSpec;
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
