package com.bdqn.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@TableName(value = "contact")
public class Contact {
    @TableId(value = "serial_id",type = IdType.ID_WORKER_STR)
    private String serialId;

    @TableField(value = "man_name")
    private String manName;

    @TableField(value = "man_station")
    private String manStation;

    @TableField(value = "man_address")
    private String manAddress;

    @TableField(value = "man_tel")
    private String manTel;

    @TableField(value = "company_oid")
    private String companyOid;

    @TableField(value = "man_type_id")
    private String manTypeId;

    @TableField(value = "operate_name")
    private String operateName;

    @TableField(value = "operate_date_time")
    private Date operateDateTime;

    @TableField(exist = false)
    private String manType;

}
