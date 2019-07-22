package com.yinxt.promotion.project.blog.model;

import lombok.Data;

import java.util.Date;

/**
 * 用户类模型
 *
 * @author yinxiaotian
 */
@Data
public class UserModel {
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
}
