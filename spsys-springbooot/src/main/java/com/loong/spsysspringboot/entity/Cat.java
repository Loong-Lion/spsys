package com.loong.spsysspringboot.entity;

/**
 * @Author: L00NG
 * @Date: 2020/2/12 23:08
 */
public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
