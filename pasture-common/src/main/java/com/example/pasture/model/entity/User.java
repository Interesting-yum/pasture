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
@TableName(value = "`user`")
public class User implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "user_name")
    private String userName;

    @TableField(value = "user_weixin")
    private String userWeixin;

    @TableField(value = "user_account")
    private String userAccount;

    @TableField(value = "user_password")
    private String userPassword;

    @TableField(value = "user_phone")
    private String userPhone;

    @TableField(value = "user_jurisdiction")
    private String userJurisdiction;

    @TableField(value = "user_remark")
    private String userRemark;

    @TableField(value = "user_record_time")
    private Date userRecordTime;

    @TableField(value = "user_operator")
    private Integer userOperator;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_USER_WEIXIN = "user_weixin";

    public static final String COL_USER_ACCOUNT = "user_account";

    public static final String COL_USER_PASSWORD = "user_password";

    public static final String COL_USER_PHONE = "user_phone";

    public static final String COL_USER_JURISDICTION = "user_jurisdiction";

    public static final String COL_USER_REMARK = "user_remark";

    public static final String COL_USER_RECORD_TIME = "user_record_time";

    public static final String COL_USER_OPERATOR = "user_operator";
}