package com.pjb.springbootauthoritymanage.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysRole {
    private Integer id;
    private String name;
    private Integer type;
    private Integer status;
    private String remark;
    private String operator;
    private Date operateTime;
    private String operateIp;

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }
}