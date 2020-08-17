package com.example.pasture.model.entity;

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
@TableName(value = "pasture")
public class Pasture implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "pasture_name")
    private String pastureName;

    @TableField(value = "pasture_range")
    private String pastureRange;

    @TableField(value = "pasture_quality")
    private String pastureQuality;

    @TableField(value = "pasture_lng")
    private String pastureLng;

    @TableField(value = "pasture_lat")
    private String pastureLat;

    @TableField(value = "pasture_remark")
    private String pastureRemark;

    @TableField(value = "pasture_record_time")
    private Date pastureRecordTime;

    @TableField(value = "pasture_operator")
    private Integer pastureOperator;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_PASTURE_NAME = "pasture_name";

    public static final String COL_PASTURE_RANGE = "pasture_range";

    public static final String COL_PASTURE_QUALITY = "pasture_quality";

    public static final String COL_PASTURE_LNG = "pasture_lng";

    public static final String COL_PASTURE_LAT = "pasture_lat";

    public static final String COL_PASTURE_REMARK = "pasture_remark";

    public static final String COL_PASTURE_RECORD_TIME = "pasture_record_time";

    public static final String COL_PASTURE_OPERATOR = "pasture_operator";
}