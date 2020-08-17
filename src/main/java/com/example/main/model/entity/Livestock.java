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
@TableName(value = "livestock")
public class Livestock implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "livestock_name")
    private String livestockName;

    @TableField(value = "livestock_type")
    private Integer livestockType;

    @TableField(value = "livestock_weight")
    private Double livestockWeight;

    @TableField(value = "livestock_height")
    private Double livestockHeight;

    @TableField(value = "livestock_length")
    private Double livestockLength;

    @TableField(value = "livestock_varieties")
    private String livestockVarieties;

    @TableField(value = "livestock_gender")
    private Integer livestockGender;

    @TableField(value = "livestock_age")
    private Integer livestockAge;

    @TableField(value = "livestock_birthday")
    private Date livestockBirthday;

    @TableField(value = "livestock_remark")
    private String livestockRemark;

    @TableField(value = "livestock_record_time")
    private Date livestockRecordTime;

    @TableField(value = "livestock_operator")
    private Integer livestockOperator;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_LIVESTOCK_NAME = "livestock_name";

    public static final String COL_LIVESTOCK_TYPE = "livestock_type";

    public static final String COL_LIVESTOCK_WEIGHT = "livestock_weight";

    public static final String COL_LIVESTOCK_HEIGHT = "livestock_height";

    public static final String COL_LIVESTOCK_LENGTH = "livestock_length";

    public static final String COL_LIVESTOCK_VARIETIES = "livestock_varieties";

    public static final String COL_LIVESTOCK_GENDER = "livestock_gender";

    public static final String COL_LIVESTOCK_AGE = "livestock_age";

    public static final String COL_LIVESTOCK_BIRTHDAY = "livestock_birthday";

    public static final String COL_LIVESTOCK_REMARK = "livestock_remark";

    public static final String COL_LIVESTOCK_RECORD_TIME = "livestock_record_time";

    public static final String COL_LIVESTOCK_OPERATOR = "livestock_operator";
}