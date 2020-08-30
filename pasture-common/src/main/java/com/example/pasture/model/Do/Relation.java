package com.example.pasture.model.Do;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Relation implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 关联表名
     */
    private String relationMain;

    /**
     * 关联表id
     */
    private Integer relationMainId;

    /**
     * 从属关联表名
     */
    private String relationSecond;

    /**
     * 从属关联表id
     */
    private Integer relationSecondId;

    /**
     * 备注
     */
    private String relationRemark;

    /**
     * 记录时间
     */
    private Date relationRecordTime;

    /**
     * 操作人
     */
    private Integer relationOperator;

    private static final long serialVersionUID = 1L;
}

