package com.example.pasture.model.Do;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class File implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 文件大小
     */
    private Integer fileSize;

    /**
     * 文件URL地址
     */
    private String fileUrl;

    /**
     * 文件Base64的值
     */
    private byte[] fileData;

    /**
     * 备注
     */
    private String fileRemark;

    /**
     * 记录时间
     */
    private Date fileRecordTime;

    /**
     * 操作人
     */
    private Integer fileOperator;

    private static final long serialVersionUID = 1L;
}

