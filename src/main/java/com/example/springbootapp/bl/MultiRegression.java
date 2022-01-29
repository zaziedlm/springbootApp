package com.example.springbootapp.bl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.example.springbootapp.jackson.Value;

import org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression;

/**
 * MultiRegression
 *
 */
public class MultiRegression 
{
    public double[] analyse(List<Value> collectData )
    {
        // double[] y = new double[] {197,  237.1,  282.3,  322.3,  362.8,  392.5,  418.9,  446.6,  443,  329.8,  287.1,  269.4};
        // double[][] x = new double[y.length][];

        // int idx = 0;
        // x[idx++] = new double[]{361.0 , 19.0};
        // x[idx++] = new double[]{529.0 , 23.0};
        // x[idx++] = new double[]{756.3 , 27.5};
        // x[idx++] = new double[]{1056.3 , 32.5};
        // x[idx++] = new double[]{1406.3 , 37.5};
        // x[idx++] = new double[]{1814.8 , 42.6};
        // x[idx++] = new double[]{2256.3 , 47.5};
        // x[idx++] = new double[]{2745.8 , 52.4};
        // x[idx++] = new double[]{3294.8 , 57.4};
        // x[idx++] = new double[]{3881.3 , 62.3};
        // x[idx++] = new double[]{4515.8 , 67.2};
        // x[idx++] = new double[]{5329.0 , 73.0};

        // Java Stream型に変換する
        Stream<Value> stm = collectData.stream();

        // Streamを使って、データ部から年齢データのみ抜き出して、その配列データを生成する
        double[] ages = stm.filter(i -> (i.getTab()).equals("33"))
                            .map(Value::get$)
                            .mapToDouble(Double::parseDouble)
                            .toArray();

        // 年齢と同様にして収入金額についても、その配列データを生成する
        stm = collectData.stream();
        double[] incomes = stm.filter(i -> (i.getTab()).equals("40"))
                            .map(Value::get$)
                            .mapToDouble(Double::parseDouble)
                            .toArray();

        // 回帰分析クラスの引数型に合わせた、二次元配列を生成、データセットする
        double[][] multiData = new double[ages.length][2];
        for(int i=0; i < ages.length; i++) {
            multiData[i][0] = Math.pow(ages[i], 2);
            multiData[i][1] = ages[i];
        }
        
        // 重回帰分析のため、インスタンス生成
        OLSMultipleLinearRegression reg = new OLSMultipleLinearRegression();
        // データのセット
        reg.newSampleData(incomes, multiData);

        // for debug. 推定したパラメータを表示
        System.out.println("定数項：" +
            Arrays.toString(reg.estimateRegressionParameters())
        );

        return reg.estimateRegressionParameters();

    }
}
