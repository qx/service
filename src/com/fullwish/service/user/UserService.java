package com.fullwish.service.user;

import java.io.Serializable;

import com.fullwish.bean.entity.User;
import com.fullwish.service.base.DAO;

public interface UserService extends DAO<User>{
    /**
     * ����ָ���û�
     * @param user_googles
     */
    public void enable(Serializable ... user_googles);
    /**
     * �ж��û��Ƿ����
     * @param user_google
     * @return
     */
    public boolean exsit(String user_google);
//    /**
//     * �ж��û����������Ƿ���ȷ
//     * @param user_google
//     * @param password
//     * @return
//     */
//    public boolean checkUser(String user_google, String password);
//    /**
//     * ��������
//     * @param user_google �û���
//     * @param newpassword ������
//     */
//    public void updatePassword(String user_google, String newpassword);
}
