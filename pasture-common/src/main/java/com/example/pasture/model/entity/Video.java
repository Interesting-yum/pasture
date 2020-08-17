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
@TableName(value = "video")
public class Video implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "video_name")
    private String videoName;

    @TableField(value = "video_interface")
    private String videoInterface;

    @TableField(value = "video_url")
    private String videoUrl;

    @TableField(value = "video_size")
    private Integer videoSize;

    @TableField(value = "video_isonline")
    private Integer videoIsonline;

    @TableField(value = "video_factoryinfo")
    private String videoFactoryinfo;

    @TableField(value = "video_remark")
    private String videoRemark;

    @TableField(value = "video_record_time")
    private Date videoRecordTime;

    @TableField(value = "video_operator")
    private Integer videoOperator;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_VIDEO_NAME = "video_name";

    public static final String COL_VIDEO_INTERFACE = "video_interface";

    public static final String COL_VIDEO_URL = "video_url";

    public static final String COL_VIDEO_SIZE = "video_size";

    public static final String COL_VIDEO_ISONLINE = "video_isonline";

    public static final String COL_VIDEO_FACTORYINFO = "video_factoryinfo";

    public static final String COL_VIDEO_REMARK = "video_remark";

    public static final String COL_VIDEO_RECORD_TIME = "video_record_time";

    public static final String COL_VIDEO_OPERATOR = "video_operator";
}