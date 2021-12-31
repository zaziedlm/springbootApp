package com.example.springbootapp.bl;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

/**
 * Httpclient_Get_estat
 *
 */
public class HttpclientGetestat 
{
    public String getestatData( String jsonUrl )
    {
        //String jsonUrl ="http://api.e-stat.go.jp/rest/3.0/app/json/getStatsData?cdCat03=02&cdCat04=02%2C03%2C04%2C05%2C06%2C07%2C08%2C09%2C10%2C11%2C12%2C13&cdCat05=01&cdTab=33%2C40&cdCat01=01&cdCat02=01&cdCat06=02&appId=2e99eca4bfb042927002486665e2a2f14d77aa12&lang=J&statsDataId=0003425893&metaGetFlg=Y&cntGetFlg=N&explanationGetFl";


        HttpClient hclt = HttpClient.newBuilder()
                        .build();

        HttpRequest hreq = HttpRequest.newBuilder()
                        .uri(URI.create(jsonUrl))
                        .GET()
                        .build();

        String data = null;
        try {
            // http requestの実行、responseの取得
            HttpResponse<String> hres = hclt.send(hreq, BodyHandlers.ofString());

            // HTTP Status Code の出力
            System.out.println(hres.statusCode());
 
            // Response Body の出力
            System.out.println(hres.body());

            data =  hres.body();

        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();   
        }

        return data;
    }
}
