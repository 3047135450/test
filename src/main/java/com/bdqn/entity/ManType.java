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
@TableName(value = "manType")
public class ManType {
    @TableId(value = "id",type = IdType.ID_WORKER_STR)
    private int id;

    @TableField(value = "type")
    private String type;
}
