package com.fullwish.service.user;

import java.io.Serializable;

import com.fullwish.bean.entity.User;
import com.fullwish.service.base.DAO;

public interface UserService extends DAO<User>{
    /**
     * 启用指定用户
     * @param user_googles
     */
    public void enable(Serializable ... user_googles);
    /**
     * 判断用户是否存在
     * @param user_google
     * @return
     */
    public boolean exsit(String user_google);
    /**
     * 判断用户名及密码是否正确
     * @param user_email
     * @param user_password
     * @return
     */
    public boolean checkUser(String user_email, String user_password);
//    /**
//     * 更新密码
//     * @param user_google 用户名
//     * @param newpassword 新密码
//     */
//    public void updatePassword(String user_google, String newpassword);
}
