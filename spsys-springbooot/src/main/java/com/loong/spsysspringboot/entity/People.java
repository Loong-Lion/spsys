package com.loong.spsysspringboot.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: L00NG
 * @Date: 2020/2/12 18:47
 */


@Data
@Component
public class People {
    private String name = "小明";
    private Integer age;

    @Autowired
    private BodyInfo bodyInfo;
}
