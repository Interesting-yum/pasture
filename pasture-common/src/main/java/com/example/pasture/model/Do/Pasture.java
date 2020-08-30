package com.example.pasture.model.Do;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Pasture implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 牧场名称
     */
    private String pastureName;

    /**
     * 牧场范围
     */
    private String pastureRange;

    /**
     * 土地品种
     */
    private String pastureQuality;

    /**
     * 经度
     */
    private String pastureLng;

    /**
     * 纬度
     */
    private String pastureLat;

    /**
     * 备注
     */
    private String pastureRemark;

    /**
     * 记录时间
     */
    private Date pastureRecordTime;

    /**
     * 操作人
     */
    private Integer pastureOperator;

    private static final long serialVersionUID = 1L;
}

