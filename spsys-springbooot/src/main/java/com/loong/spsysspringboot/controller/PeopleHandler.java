package com.loong.spsysspringboot.controller;

import com.loong.spsysspringboot.entity.BodyInfo;
import com.loong.spsysspringboot.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: L00NG
 * @Date: 2020/2/13 23:56
 */
@RestController
public class PeopleHandler {
    @Autowired
    private People people;

    @Autowired
    private BodyInfo bodyInfo;

    @GetMapping(path = "/test")
    public String text(Double height,Double weight) {
        return people.getName() + "--" + bodyInfo.getBMI(height,weight);
    }
}
