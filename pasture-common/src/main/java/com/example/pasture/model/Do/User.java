package com.example.pasture.model.Do;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class User implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户微信绑定openid
     */
    private String userWeixin;

    /**
     * 用户登录账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户手机号
     */
    private String userPhone;

    /**
     * 用户权限
     */
    private String userJurisdiction;

    /**
     * 备注
     */
    private String userRemark;

    /**
     * 记录时间
     */
    private Date userRecordTime;

    /**
     * 操作人
     */
    private Integer userOperator;

    private static final long serialVersionUID = 1L;
}

