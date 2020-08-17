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
@TableName(value = "`file`")
public class File implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "file_name")
    private String fileName;

    @TableField(value = "file_type")
    private String fileType;

    @TableField(value = "file_size")
    private Integer fileSize;

    @TableField(value = "file_url")
    private String fileUrl;

    @TableField(value = "file_data")
    private byte[] fileData;

    @TableField(value = "file_remark")
    private String fileRemark;

    @TableField(value = "file_record_time")
    private Date fileRecordTime;

    @TableField(value = "file_operator")
    private Integer fileOperator;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_FILE_NAME = "file_name";

    public static final String COL_FILE_TYPE = "file_type";

    public static final String COL_FILE_SIZE = "file_size";

    public static final String COL_FILE_URL = "file_url";

    public static final String COL_FILE_DATA = "file_data";

    public static final String COL_FILE_REMARK = "file_remark";

    public static final String COL_FILE_RECORD_TIME = "file_record_time";

    public static final String COL_FILE_OPERATOR = "file_operator";
}