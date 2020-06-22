package com.loong.spsysspringboot.controller;

import com.loong.spsysspringboot.entity.SparePart;
import com.loong.spsysspringboot.repository.SparePartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: L00NG
 * @Date: 2020/2/2 21:57
 */
@RestController
public class SpareHandler {
    @Autowired
    private SparePartRepository sparePartRepository;

    @GetMapping("/findAll")
    public List<SparePart> findAll(){
        return sparePartRepository.findAll();
    }
}
