package com.yinxt.promotion.project.blog.mapper;

import com.yinxt.promotion.project.blog.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户mapper
 *
 * @author yinxiaotian
 * @date 2019-06-16
 */
@Mapper
public interface UserMapper {

    List<UserModel> selectUsersInfo();

    int insertUserInfo(UserModel userModel);

    int updateUserInfo(UserModel userModel);

}
