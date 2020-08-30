package com.example.pasture.model.Do;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Livestock implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 姓名
     */
    private String livestockName;

    /**
     * 类型
     */
    private Integer livestockType;

    /**
     * 体重
     */
    private Double livestockWeight;

    /**
     * 身高
     */
    private Double livestockHeight;

    /**
     * 长度
     */
    private Double livestockLength;

    /**
     * 品种
     */
    private String livestockVarieties;

    /**
     * 性别
     */
    private Integer livestockGender;

    /**
     * 年龄
     */
    private Integer livestockAge;

    /**
     * 生日
     */
    private Date livestockBirthday;

    /**
     * 备注
     */
    private String livestockRemark;

    /**
     * 记录时间
     */
    private Date livestockRecordTime;

    /**
     * 操作人
     */
    private Integer livestockOperator;

    private static final long serialVersionUID = 1L;
}

