package com.example.pasture.model.Do;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Video implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 视频名称
     */
    private String videoName;

    /**
     * 视频接口
     */
    private String videoInterface;

    /**
     * 视频路径
     */
    private String videoUrl;

    /**
     * 视频大小
     */
    private Integer videoSize;

    /**
     * 是否在线
     */
    private Integer videoIsonline;

    /**
     * 厂家信息
     */
    private String videoFactoryinfo;

    /**
     * 备注
     */
    private String videoRemark;

    /**
     * 记录时间
     */
    private Date videoRecordTime;

    /**
     * 操作人
     */
    private Integer videoOperator;

    private static final long serialVersionUID = 1L;
}

