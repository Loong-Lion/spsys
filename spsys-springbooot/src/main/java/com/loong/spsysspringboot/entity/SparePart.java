package com.loong.spsysspringboot.entity;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;

/**
 * @Author: L00NG
 * @Date: 2020/1/31 22:27
 */
@Data
@Entity
public class SparePart {
    /*todo spCode有空值不能做主键，需要自增id做主键，
    *  需要增加各数量的数组，用分号分割
    *  存放地点也用数组*/
    @Id
    //物料编码
    private String spCode;
    //工区
    private String spWorkArea;
    //子系统
    private String subSystem;
    //备件名称
    private String spName;
    //通号专业通用名称
    private String specialtyName;
    //物料类型
    private String spType;
    //数量 等于实际数量
    private Integer spNumber;
    //单位
    private String spUnit;
    //存放位置
    private String spAddr;
    //账面数量 physical count quantity
    private Integer spPhyCount;
    //差异数量
    private Integer spDifCount;
    //差异原因
    private String spDifCause;
}
