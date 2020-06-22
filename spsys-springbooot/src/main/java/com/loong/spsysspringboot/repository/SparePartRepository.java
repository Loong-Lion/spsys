package com.loong.spsysspringboot.repository;

import com.loong.spsysspringboot.entity.SparePart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: L00NG
 * @Date: 2020/2/2 12:28
 */
public interface SparePartRepository extends JpaRepository<SparePart,Integer> {
}
