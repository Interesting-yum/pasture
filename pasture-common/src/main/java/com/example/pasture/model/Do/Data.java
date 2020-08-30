package com.example.pasture.model.Do;

import java.io.Serializable;
import java.util.Date;

@lombok.Data
public class Data implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 数据名称
     */
    private String dataName;

    /**
     * 数据类型
     */
    private String dataType;

    /**
     * 等级
     */
    private Integer dataLevel;

    /**
     * 数据内容
     */
    private String dataContent;

    /**
     * 备注
     */
    private String dataRemark;

    /**
     * 记录时间
     */
    private Date dataRecordTime;

    /**
     * 操作人
     */
    private Integer dataOperator;

    private static final long serialVersionUID = 1L;
}

