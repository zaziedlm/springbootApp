package com.example.springbootapp.controller;

import com.example.springbootapp.bl.HttpclientGetestat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetJsonData {

    @GetMapping("/getjson")
    public String getjson(Model model) {

        String jsonUrl ="http://api.e-stat.go.jp/rest/3.0/app/json/getStatsData?cdCat03=02&cdCat04=02%2C03%2C04%2C05%2C06%2C07%2C08%2C09%2C10%2C11%2C12%2C13&cdCat05=01&cdTab=33%2C40&cdCat01=01&cdCat02=01&cdCat06=02&appId=2e99eca4bfb042927002486665e2a2f14d77aa12&lang=J&statsDataId=0003425893&metaGetFlg=Y&cntGetFlg=N&explanationGetFl";
      
        HttpclientGetestat hcg = new HttpclientGetestat();
        String data = hcg.getestatData(jsonUrl);
        model.addAttribute("data", data);
        return "jsondata";
    }
    
}
