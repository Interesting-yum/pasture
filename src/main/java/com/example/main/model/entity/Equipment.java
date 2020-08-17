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
@TableName(value = "equipment")
public class Equipment implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "equipment_name")
    private String equipmentName;

    @TableField(value = "equipment_interface")
    private String equipmentInterface;

    @TableField(value = "equipment_material")
    private String equipmentMaterial;

    @TableField(value = "equipment_inner_address")
    private String equipmentInnerAddress;

    @TableField(value = "equipment_physical_address")
    private String equipmentPhysicalAddress;

    @TableField(value = "equipment_inner_value")
    private String equipmentInnerValue;

    @TableField(value = "equipment_isonline")
    private Integer equipmentIsonline;

    @TableField(value = "equipment_factoryinfo")
    private String equipmentFactoryinfo;

    @TableField(value = "equipment_remark")
    private String equipmentRemark;

    @TableField(value = "equipment_record_time")
    private Date equipmentRecordTime;

    @TableField(value = "equipment_operator")
    private Integer equipmentOperator;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_EQUIPMENT_NAME = "equipment_name";

    public static final String COL_EQUIPMENT_INTERFACE = "equipment_interface";

    public static final String COL_EQUIPMENT_MATERIAL = "equipment_material";

    public static final String COL_EQUIPMENT_INNER_ADDRESS = "equipment_inner_address";

    public static final String COL_EQUIPMENT_PHYSICAL_ADDRESS = "equipment_physical_address";

    public static final String COL_EQUIPMENT_INNER_VALUE = "equipment_inner_value";

    public static final String COL_EQUIPMENT_ISONLINE = "equipment_isonline";

    public static final String COL_EQUIPMENT_FACTORYINFO = "equipment_factoryinfo";

    public static final String COL_EQUIPMENT_REMARK = "equipment_remark";

    public static final String COL_EQUIPMENT_RECORD_TIME = "equipment_record_time";

    public static final String COL_EQUIPMENT_OPERATOR = "equipment_operator";
}