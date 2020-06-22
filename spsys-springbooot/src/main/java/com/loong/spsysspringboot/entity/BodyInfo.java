package com.loong.spsysspringboot.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author: L00NG
 * @Date: 2020/2/13 23:43
 */


@Data
@Component
public class BodyInfo {
    private Double height ;
    private Double weight ;

    public String getBMI(Double height,Double weight){
        Double BMI = weight / (height * height);
        return String.format("%.1f", BMI);
    }
}
