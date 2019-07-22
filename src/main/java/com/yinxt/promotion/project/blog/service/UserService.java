package com.yinxt.promotion.project.blog.service;

import com.alibaba.fastjson.JSON;
import com.yinxt.promotion.project.blog.common.Result;
import com.yinxt.promotion.project.blog.common.ResultEnum;
import com.yinxt.promotion.project.blog.mapper.UserMapper;
import com.yinxt.promotion.project.blog.model.UserModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户服务类
 *
 * @author yinxiaotian
 * @date 2019-06-16
 */
@Service
@Slf4j
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Result getUsersInfo() {
        log.info("获取用户列表");
        List<UserModel> userModelList = userMapper.selectUsersInfo();
        log.info("返回用户列表：{}", JSON.toJSONString(userModelList));
        return new Result(ResultEnum.SUCCESS, userModelList);
    }

    public Result addUser(UserModel userModel) {
        log.info("添加用户：", JSON.toJSONString(userModel));
        userMapper.insertUserInfo(userModel);
        log.info("添加用户:{}成功", userModel.getUserId());
        return new Result(ResultEnum.SUCCESS);
    }

    public Result modifyUser(UserModel userModel){
        log.info("修改用户信息：{}", JSON.toJSONString(userModel));
        userMapper.updateUserInfo(userModel);
        log.info("修改用户：{}信息成功", userModel.getUserId());
        return new Result(ResultEnum.SUCCESS);
    }
}
