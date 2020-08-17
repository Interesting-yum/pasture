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
@TableName(value = "relation")
public class Relation implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "relation_main")
    private String relationMain;

    @TableField(value = "relation_main_id")
    private Integer relationMainId;

    @TableField(value = "relation_second")
    private String relationSecond;

    @TableField(value = "relation_second_id")
    private Integer relationSecondId;

    @TableField(value = "relation_remark")
    private String relationRemark;

    @TableField(value = "relation_record_time")
    private Date relationRecordTime;

    @TableField(value = "relation_operator")
    private Integer relationOperator;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_RELATION_MAIN = "relation_main";

    public static final String COL_RELATION_MAIN_ID = "relation_main_id";

    public static final String COL_RELATION_SECOND = "relation_second";

    public static final String COL_RELATION_SECOND_ID = "relation_second_id";

    public static final String COL_RELATION_REMARK = "relation_remark";

    public static final String COL_RELATION_RECORD_TIME = "relation_record_time";

    public static final String COL_RELATION_OPERATOR = "relation_operator";
}