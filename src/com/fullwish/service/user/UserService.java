package com.fullwish.service.user;

import java.io.Serializable;

import com.fullwish.bean.entity.User;
import com.fullwish.service.base.DAO;

public interface UserService extends DAO<User> {
    /**
     * ����ָ���û�
     * 
     * @param user_googles
     */
    public void enable(Serializable... user_googles);

    /**
     * �ж��û��Ƿ����
     * 
     * @param user_google
     * @return
     */
    public boolean exsit(String user_google);

    /**
     * �ж��û����������Ƿ���ȷ
     * 
     * @param user_email
     * @param user_password
     * @return
     */
    public boolean checkUser(String user_email, String user_password);

    /**
     * �û���Ϣ(user_country,user_career,user_nickname)
     * 
     * @param user_email
     *            �û���
     * @param user_country
     *            �û�����
     * @param user_career
     *            �û�ְҵ
     * @param user_nickname
     *            �û��ǳ�
     */
    public void updateUserInfo(String user_email, String user_country,
            String user_career, String user_nickname);
}
