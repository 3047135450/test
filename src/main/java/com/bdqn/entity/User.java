package com.bdqn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@TableName(value = "man_user")
public class User {
    @TableId(value = "id",type = IdType.ID_WORKER_STR)
    private String id;

    @TableField(value = "username")
    private String username;

    @TableField(value = "password")
    private String password;
}
