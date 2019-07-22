package com.yinxt.promotion.project.blog.controller;

import com.yinxt.promotion.project.blog.common.JdbcTemplateUtil;
import com.yinxt.promotion.project.blog.common.Result;
import com.yinxt.promotion.project.blog.common.ResultEnum;
import com.yinxt.promotion.project.blog.model.UserModel;
import com.yinxt.promotion.project.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户类控制器
 *
 * @author yinxiaotian
 * @date 2019-06-15
 */

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "info/get")
    public Result getUsersInfo() {
        return userService.getUsersInfo();
    }

    @RequestMapping(value = "info/add")
    public Result addUser(@RequestBody UserModel userModel) {
        return userService.addUser(userModel);
    }

    @RequestMapping(value = "info/modify")
    public Result modifyUser(@RequestBody UserModel userModel) {
        return userService.modifyUser(userModel);
    }
}
