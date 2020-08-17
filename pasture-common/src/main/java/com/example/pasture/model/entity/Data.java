package com.example.pasture.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "`data`")
public class Data implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "data_name")
    private String dataName;

    @TableField(value = "data_type")
    private String dataType;

    @TableField(value = "data_level")
    private Integer dataLevel;

    @TableField(value = "data_content")
    private String dataContent;

    @TableField(value = "data_remark")
    private String dataRemark;

    @TableField(value = "data_record_time")
    private Date dataRecordTime;

    @TableField(value = "data_operator")
    private Integer dataOperator;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_DATA_NAME = "data_name";

    public static final String COL_DATA_TYPE = "data_type";

    public static final String COL_DATA_LEVEL = "data_level";

    public static final String COL_DATA_CONTENT = "data_content";

    public static final String COL_DATA_REMARK = "data_remark";

    public static final String COL_DATA_RECORD_TIME = "data_record_time";

    public static final String COL_DATA_OPERATOR = "data_operator";
}