package com.example.pasture.model.Do;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Equipment implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 设备名称
     */
    private String equipmentName;

    /**
     * 设备接口
     */
    private String equipmentInterface;

    /**
     * 设备材质
     */
    private String equipmentMaterial;

    /**
     * 内在地址
     */
    private String equipmentInnerAddress;

    /**
     * 物理地址
     */
    private String equipmentPhysicalAddress;

    /**
     * 内部定值
     */
    private String equipmentInnerValue;

    /**
     * 是否在线
     */
    private Integer equipmentIsonline;

    /**
     * 厂家信息
     */
    private String equipmentFactoryinfo;

    /**
     * 备注
     */
    private String equipmentRemark;

    /**
     * 记录时间
     */
    private Date equipmentRecordTime;

    /**
     * 操作人
     */
    private Integer equipmentOperator;

    private static final long serialVersionUID = 1L;
}

