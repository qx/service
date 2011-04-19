package com.fullwish.service.mission;

import java.io.Serializable;

import com.fullwish.bean.entity.Mission;
import com.fullwish.service.base.DAO;

public interface MissionService extends DAO<Mission> {

    /**
     * ����ָ��װ��
     * 
     * @param mission_id
     */
    public void enable(Serializable... mission_id);

    /**
     * �ж�װ���Ƿ����
     * 
     * @param mission_id
     * @return
     */
    public boolean exsit(String mission_id);

    /**
     * �ж��û����������Ƿ���ȷ
     * 
     * @param user_email
     * @param user_password
     * @return
     */
    // public boolean checkUser(String user_email, String user_password);
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
    // public void updateEquipInfo(String user_email, String user_country,
    // String user_career, String user_nickname);
}
