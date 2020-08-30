package com.example.pasture.model.Do;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Vaccines implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 疫苗名称
     */
    private String vaccinesName;

    /**
     * 疫苗类型
     */
    private Integer vaccinesType;

    /**
     * 剂量
     */
    private Integer vaccinesDose;

    /**
     * 规格
     */
    private String vaccinesSpecifications;

    /**
     * 注射时间
     */
    private Date vaccinesTime;

    /**
     * 备注
     */
    private String vaccinesRemark;

    /**
     * 记录时间
     */
    private Date vaccinesRecordTime;

    /**
     * 操作人
     */
    private String vaccinesOperator;

    private static final long serialVersionUID = 1L;
}

