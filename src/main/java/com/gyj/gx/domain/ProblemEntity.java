package com.gyj.gx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_problem")
@Data
public class ProblemEntity {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;// 表主键ID

    private Integer problemType;// 一级分类 0:客观题 1:主观题

    private String description ; //题目描述即题干

    private String optionA; //选项A

    private String optionB; //选项B

    private String optionC; //选项C

    private String optionD; //选项D

    private String answer; //参考答案

    private String explanation;//解析

    @TableLogic
    private Integer deleted;// 逻辑删除 0 未删除 1 已删除
}
