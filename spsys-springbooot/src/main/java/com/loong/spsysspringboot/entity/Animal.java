package com.loong.spsysspringboot.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: L00NG
 * @Date: 2020/2/12 18:44
 */

public class Animal {
    String Name;
    String Food;

    public void eat(){
        System.out.println("动物在吃东西");
    }

}
