package com.spring.service;

import com.spring.domain.model.User;
import com.spring.domain.model.UserAuth;
import com.spring.domain.model.VO.UserRoleVO;
import com.spring.domain.model.request.UserRequest;
import com.spring.domain.model.request.UserRoleRequest;
import com.spring.domain.model.request.UserUpdateRequest;

import java.util.List;

/**
 * @Description 用户service接口
 * @Author ErnestCheng
 * @Date 2017/5/27.
 */
public interface UserService {
    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 通过用户id获得用户信息
     * @param userId
     * @return
     */
    User getUserById(Integer userId);

    /**
     * 得到用户通过名称
     * @param userName
     * @return
     */
    User getUserByName(String userName);



    /**
     * 获得用户角色信息
     * @param userId
     * @return
     */
    UserRoleVO listUserRoleVO(Integer userId);

    /**
     * 添加用户，添加用户角色
     * @param user
     * @param roleIds
     */
    void addUserAndRole(User user,List<Integer> roleIds);

    /**
     * 更新用户信息
     * @param userUpdateRequest
     * @return
     */
    int updateUser(UserUpdateRequest userUpdateRequest);

    /**
     * 删除用户信息
     * @param userId
     * @return
     */
    int deleteUserByUserId(Integer userId);

    /**
     * 更新用户密码
     * @param newPassword
     * @param oldPassword
     * @param user
     * @return
     */
    int updatePassword(String newPassword,String oldPassword,User user);
}
