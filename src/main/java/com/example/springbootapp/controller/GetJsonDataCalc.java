package com.example.springbootapp.controller;

import java.util.Arrays;
import java.util.List;

import com.example.springbootapp.bl.HttpclientGetestat;
import com.example.springbootapp.bl.JsonReader;
import com.example.springbootapp.bl.MultiRegression;
import com.example.springbootapp.jackson.Value;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetJsonDataCalc {

    @GetMapping("/getjson")
    public String getjson(Model model) {

        String jsonUrl ="http://api.e-stat.go.jp/rest/3.0/app/json/getStatsData?cdCat03=02&cdCat04=02%2C03%2C04%2C05%2C06%2C07%2C08%2C09%2C10%2C11%2C12%2C13&cdCat05=01&cdTab=33%2C40&cdCat01=01&cdCat02=01&cdCat06=02&appId=2e99eca4bfb042927002486665e2a2f14d77aa12&lang=J&statsDataId=0003425893&metaGetFlg=Y&cntGetFlg=N&explanationGetFl";
      
        HttpclientGetestat hcg = new HttpclientGetestat();
        String data = hcg.getestatData(jsonUrl);

        // data = """
        // {"GET_STATS_DATA":{"RESULT":{"STATUS":0,"ERROR_MSG":"\u6B63\u5E38\u306B\u7D42\u4E86\u3057\u307E\u3057\u305F\u3002","DATE":"2021-12-19T01:43:03.076+09:00"},"PARAMETER":{"LANG":"J","STATS_DATA_ID":"0003425893","NARROWING_COND":{"CODE_TAB_SELECT":"33,40","CODE_CAT01_SELECT":"01","CODE_CAT02_SELECT":"01","CODE_CAT03_SELECT":"02","CODE_CAT04_SELECT":"02,03,04,05,06,07,08,09,10,11,12,13","CODE_CAT05_SELECT":"01","CODE_CAT06_SELECT":"02"},"DATA_FORMAT":"J","START_POSITION":1,"METAGET_FLG":"Y","EXPLANATION_GET_FLG":"Y","ANNOTATION_GET_FLG":"Y","REPLACE_SP_CHARS":0,"CNT_GET_FLG":"N","SECTION_HEADER_FLG":1},"STATISTICAL_DATA":{"RESULT_INF":{"TOTAL_NUMBER":24,"FROM_NUMBER":1,"TO_NUMBER":24},"TABLE_INF":{"@id":"0003425893","STAT_NAME":{"@code":"00450091","$":"\u8CC3\u91D1\u69CB\u9020\u57FA\u672C\u7D71\u8A08\u8ABF\u67FB"},"GOV_ORG":{"@code":"00450","$":"\u539A\u751F\u52B4\u50CD\u7701"},"STATISTICS_NAME":"\u8CC3\u91D1\u69CB\u9020\u57FA\u672C\u7D71\u8A08\u8ABF\u67FB","TITLE":{"@no":"1","$":"\u4E00\u822C_\u7523\u696D\u5927\u30FB\u4E2D\u5206\u985E_\u5E74\u9F62\u968E\u7D1A\u5225DB"},"CYCLE":"-","SURVEY_DATE":0,"OPEN_DATE":"2021-05-21","SMALL_AREA":0,"COLLECT_AREA":"\u5168\u56FD","MAIN_CATEGORY":{"@code":"03","$":"\u52B4\u50CD\u30FB\u8CC3\u91D1"},"SUB_CATEGORY":{"@code":"02","$":"\u8CC3\u91D1\u30FB\u52B4\u50CD\u6761\u4EF6"},"OVERALL_TOTAL_NUMBER":1168128,"UPDATED_DATE":"2021-07-16","STATISTICS_NAME_SPEC":{"TABULATION_CATEGORY":"\u8CC3\u91D1\u69CB\u9020\u57FA\u672C\u7D71\u8A08\u8ABF\u67FB"},"DESCRIPTION":"","TITLE_SPEC":{"TABLE_NAME":"\u4E00\u822C_\u7523\u696D\u5927\u30FB\u4E2D\u5206\u985E_\u5E74\u9F62\u968E\u7D1A\u5225DB"}},"CLASS_INF":{"CLASS_OBJ":[{"@id":"tab","@name":"\u8868\u7AE0\u9805\u76EE","CLASS":[{"@code":"33","@name":"\u5E74\u9F62","@level":"","@unit":"\u6B73"},{"@code":"40","@name":"\u304D\u307E\u3063\u3066\u652F\u7D66\u3059\u308B\u73FE\u91D1\u7D66\u4E0E\u984D","@level":"","@unit":"\u5343\u5186"}]},{"@id":"cat01","@name":"\u4F01\u696D\u898F\u6A21_\u57FA\u672C","CLASS":{"@code":"01","@name":"\u4F01\u696D\u898F\u6A21\u8A08\uFF0810\u4EBA\u4EE5\u4E0A\uFF09","@level":"1"}},{"@id":"cat02","@name":"\u7523\u696D\u5206\u985E","CLASS":{"@code":"01","@name":"\uFF34\uFF11 \u7523\u696D\u8A08","@level":"1"}},{"@id":"cat03","@name":"\u6027\u5225_\u57FA\u672C","CLASS":{"@code":"02","@name":"\u7537","@level":"2","@parentCode":"01"}},{"@id":"cat04","@name":"\u5E74\u9F62\u968E\u7D1A_\u57FA\u672C","CLASS":[{"@code":"02","@name":"\uFF5E19\u6B73","@level":"1"},{"@code":"03","@name":"20\uFF5E24\u6B73","@level":"1"},{"@code":"04","@name":"25\uFF5E29\u6B73","@level":"1"},{"@code":"05","@name":"30\uFF5E34\u6B73","@level":"1"},{"@code":"06","@name":"35\uFF5E39\u6B73","@level":"1"},{"@code":"07","@name":"40\uFF5E44\u6B73","@level":"1"},{"@code":"08","@name":"45\uFF5E49\u6B73","@level":"1"},{"@code":"09","@name":"50\uFF5E54\u6B73","@level":"1"},{"@code":"10","@name":"55\uFF5E59\u6B73","@level":"1"},{"@code":"11","@name":"60\uFF5E64\u6B73","@level":"1"},{"@code":"12","@name":"65\uFF5E69\u6B73","@level":"1"},{"@code":"13","@name":"70\u6B73\uFF5E","@level":"1"}]},{"@id":"cat05","@name":"\u5B66\u6B74_\u57FA\u672C\uFF18\u533A\u5206\uFF082020\u5E74\uFF5E\uFF09","CLASS":{"@code":"01","@name":"\u5B66\u6B74\u8A08","@level":"1"}},{"@id":"cat06","@name":"\u6C11\u30FB\u516C\u533A\u5206","CLASS":{"@code":"02","@name":"\u6C11\u55B6\u4E8B\u696D\u6240","@level":"2","@parentCode":"01"}},{"@id":"time","@name":"\u6642\u9593\u8EF8\uFF082020\uFF5E2023\uFF09","CLASS":{"@code":"2020000000","@name":"2020\u5E74","@level":"1"}}]},"DATA_INF":{"NOTE":{"@char":"-","$":"\u8A08\u6570\u306E\u306A\u3044\u5834\u5408"},"VALUE":[{"@tab":"33","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"02","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u6B73","$":"19.0"},{"@tab":"33","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"03","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u6B73","$":"23.0"},{"@tab":"33","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"04","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u6B73","$":"27.5"},{"@tab":"33","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"05","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u6B73","$":"32.5"},{"@tab":"33","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"06","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u6B73","$":"37.5"},{"@tab":"33","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"07","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u6B73","$":"42.6"},{"@tab":"33","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"08","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u6B73","$":"47.5"},{"@tab":"33","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"09","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u6B73","$":"52.4"},{"@tab":"33","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"10","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u6B73","$":"57.4"},{"@tab":"33","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"11","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u6B73","$":"62.3"},{"@tab":"33","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"12","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u6B73","$":"67.2"},{"@tab":"33","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"13","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u6B73","$":"73.0"},{"@tab":"40","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"02","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u5343\u5186","$":"197.0"},{"@tab":"40","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"03","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u5343\u5186","$":"237.1"},{"@tab":"40","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"04","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u5343\u5186","$":"282.3"},{"@tab":"40","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"05","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u5343\u5186","$":"322.3"},{"@tab":"40","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"06","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u5343\u5186","$":"362.8"},{"@tab":"40","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"07","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u5343\u5186","$":"392.5"},{"@tab":"40","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"08","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u5343\u5186","$":"418.9"},{"@tab":"40","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"09","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u5343\u5186","$":"446.6"},{"@tab":"40","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"10","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u5343\u5186","$":"443.0"},{"@tab":"40","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"11","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u5343\u5186","$":"329.8"},{"@tab":"40","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"12","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u5343\u5186","$":"287.1"},{"@tab":"40","@cat01":"01","@cat02":"01","@cat03":"02","@cat04":"13","@cat05":"01","@cat06":"02","@time":"2020000000","@unit":"\u5343\u5186","$":"269.4"}]}}}}""";         
 


        JsonReader jr = new JsonReader();
        List<Value> collectData = null;
        try {
            collectData = jr.collectData(data);

            // for debug message.
            collectData.stream().filter(i -> (i.getTab().equals("33")))
            .forEach(i -> System.out.println(i.get$()));
            collectData.stream().filter(i -> (i.getTab().equals("40")))
            .forEach(i -> System.out.println(i.get$()));

        } catch (JsonProcessingException e) {
            // 簡易なエラー処理StackTrace出力
            e.printStackTrace();
        }

        MultiRegression mr = new MultiRegression();
        double[] regparam = mr.analyse(collectData);

        data = "定数項：" +Arrays.toString(regparam);

        model.addAttribute("data", data);
        return "jsondata";
    }
    
}
