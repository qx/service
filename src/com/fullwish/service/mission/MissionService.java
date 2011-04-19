package com.fullwish.service.mission;

import java.io.Serializable;

import com.fullwish.bean.entity.Mission;
import com.fullwish.service.base.DAO;

public interface MissionService extends DAO<Mission> {

    /**
     * 启用指定装备
     * 
     * @param mission_id
     */
    public void enable(Serializable... mission_id);

    /**
     * 判断装备是否存在
     * 
     * @param mission_id
     * @return
     */
    public boolean exsit(String mission_id);

    /**
     * 判断用户名及密码是否正确
     * 
     * @param user_email
     * @param user_password
     * @return
     */
    // public boolean checkUser(String user_email, String user_password);
    /**
     * 用户信息(user_country,user_career,user_nickname)
     * 
     * @param user_email
     *            用户名
     * @param user_country
     *            用户国家
     * @param user_career
     *            用户职业
     * @param user_nickname
     *            用户昵称
     */
    // public void updateEquipInfo(String user_email, String user_country,
    // String user_career, String user_nickname);
}
