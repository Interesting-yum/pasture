package com.example.main.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "vaccines")
public class Vaccines implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "vaccines_name")
    private String vaccinesName;

    @TableField(value = "vaccines_type")
    private Integer vaccinesType;

    @TableField(value = "vaccines_dose")
    private Integer vaccinesDose;

    /**
     * 规格
     */
    @TableField(value = "vaccines_specifications")
    private String vaccinesSpecifications;

    @TableField(value = "vaccines_time")
    private Date vaccinesTime;

    @TableField(value = "vaccines_remark")
    private String vaccinesRemark;

    @TableField(value = "vaccines_record_time")
    private Date vaccinesRecordTime;

    @TableField(value = "vaccines_operator")
    private String vaccinesOperator;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_VACCINES_NAME = "vaccines_name";

    public static final String COL_VACCINES_TYPE = "vaccines_type";

    public static final String COL_VACCINES_DOSE = "vaccines_dose";

    public static final String COL_VACCINES_SPECIFICATIONS = "vaccines_specifications";

    public static final String COL_VACCINES_TIME = "vaccines_time";

    public static final String COL_VACCINES_REMARK = "vaccines_remark";

    public static final String COL_VACCINES_RECORD_TIME = "vaccines_record_time";

    public static final String COL_VACCINES_OPERATOR = "vaccines_operator";
}