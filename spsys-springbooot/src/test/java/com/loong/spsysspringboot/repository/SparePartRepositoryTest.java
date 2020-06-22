package com.loong.spsysspringboot.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: L00NG
 * @Date: 2020/2/2 16:34
 */
@SpringBootTest
class SparePartRepositoryTest {

    @Autowired
    private SparePartRepository sparePartRepository;
    @Test
    void findAll(){

        System.out.println(sparePartRepository.findAll());
    }
}
