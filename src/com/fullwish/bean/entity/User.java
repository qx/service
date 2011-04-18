/**
 * 
 */
package com.fullwish.bean.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fullwish.utils.JsonUtil;

/**
 * @author fullwish
 * 
 */
@Entity
public class User {

    @SuppressWarnings("unchecked")
    @Override
    public String toString() {
        HashMap<String, String> user_map;
        user_map = new HashMap<String, String>();
        // * @param user_email
        user_map.put("user_email", this.user_email);
        // * @param user_password
        user_map.put("user_password", this.user_password);
        // * @param user_nickname
        user_map.put("user_nickname", this.user_nickname);
        // * @param user_action
        user_map.put("user_action", this.user_action + "");
        // * @param user_attack
        user_map.put("user_attack", this.user_attack + "");
        // * @param user_defense
        user_map.put("user_defense", this.user_defense + "");
        // * @param user_experience
        user_map.put("user_experience", this.user_experience + "");
        // * @param user_friend
        user_map.put("user_friend", this.user_friend + "");
        // * @param user_energy
        user_map.put("user_energy", this.user_energy + "");
        // * @param user_healthpoint
        user_map.put("user_healthpoint", this.user_healthpoint + "");
        // * @param user_hideAttack
        user_map.put("user_hideAttack", this.user_hideAttack + "");
        // * @param user_hideDefense
        user_map.put("user_hideDefense", this.user_hideDefense + "");
        // * @param user_level
        user_map.put("user_level", this.user_level + "");
        // * @param user_money
        user_map.put("user_money", this.user_money + "");
        // * @param user_reward_Point
        user_map.put("user_reward_Point", this.user_reward_Point + "");
        // * @param user_skill_Point
        user_map.put("user_skill_Point", this.user_skill_Point + "");
        // * @param user_career
        user_map.put("user_career", this.user_career + "");
        // * @param user_country
        user_map.put("user_country", this.user_country + "");
        // * @param user_microblog
        user_map.put("user_microblog", this.user_microblog + "");
        // * @param user_fight_win
        user_map.put("user_fight_win", this.user_fight_win + "");
        // * @param user_fight_lose
        user_map.put("user_fight_lose", this.user_fight_lose + "");
        // * @param user_kidnap
        user_map.put("user_kidnap", this.user_kidnap + "");
        // * @param user_bekidnap
        user_map.put("user_bekidnap", this.user_bekidnap + "");
        // * @param user_rescue
        user_map.put("user_rescue", this.user_rescue + "");
        // */
        String user_string = JsonUtil.map2Json((Map) user_map);
        return user_string;
    }

    /* �û�����,Ψһ��ʾ,(ȡ������) */
    private String user_email;

    /** ���� * */
    private String user_password;// ����MD5����

    /* �û��ǳ� */
    private String user_nickname;

    /* �ж��� */
    private int user_action;

    /* ������ */
    private int user_attack;

    /* ������ */
    private int user_defense;

    /* ����ֵ */
    private int user_experience;

    /* �������� */
    private int user_friend;

    /* ���� */
    private int user_energy;

    /* Ѫ��ֵ */
    private int user_healthpoint;

    /* ���ع����� */
    private int user_hideAttack;

    /* ���ط����� */
    private int user_hideDefense;

    /* �ȼ� */
    private int user_level;

    /* ��Ǯ */
    private int user_money;

    /* �������� */
    private int user_reward_Point;

    /* ���ܵ��� */
    private int user_skill_Point;

    /* ְҵ */
    private String user_career;

    /* �������� */
    private String user_country;

    /* ΢���˺� */
    private String user_microblog;

    /* ս��ʤ������ */
    private int user_fight_win;

    /* ս��ʧ�ܴ��� */
    private int user_fight_lose;

    /* ��ܴ��� */
    private int user_kidnap;

    /* ������� */
    private int user_bekidnap;

    /* ��ȴ��� */
    private int user_rescue;

    public User() {

    }

    /**
     * @param user_email
     *            �û��˺�Ψһ��ʾ,Ҳ������ȡ������
     * @param user_password
     *            �û�����,��¼��Ϸ ������������,��ʼֵ�������� �ж���3 user_action ������0 ������0 ����ֵ0 ��������0
     *            ����:10 user_energy Ѫ��ֵ:100 user_healthpoint ���ع�����:0 ���ط�����:0
     *            �ȼ�:1 user_level ��Ǯ:0 ��������:0 ���ܵ���:0 ְҵ:δ�� ��������: ΢���˺�:δ��// ����
     *            user_microblog="qx.ouyang@gmail.com" ս��ʤ������:0 ս��ʧ�ܳ���:0 ��ܴ���:0
     *            �������:0
     */
    public User(String user_email, String user_password) {
        super();
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_action = 3;
        this.user_energy = 10;
        this.user_healthpoint = 100;
        this.user_level = 1;

    }

    @Id
    @Column(length = 32)
    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    @Column(length = 32, nullable = false)
    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    @Column(length = 18)
    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String userNickname) {
        user_nickname = userNickname;
    }

    @Column
    public int getUser_action() {
        return user_action;
    }

    public void setUser_action(int userAction) {
        user_action = userAction;
    }

    @Column
    public int getUser_attack() {
        return user_attack;
    }

    public void setUser_attack(int userAttack) {
        user_attack = userAttack;
    }

    @Column
    public int getUser_defense() {
        return user_defense;
    }

    public void setUser_defense(int userDefense) {
        user_defense = userDefense;
    }

    @Column
    public int getUser_experience() {
        return user_experience;
    }

    public void setUser_experience(int userExperience) {
        user_experience = userExperience;
    }

    @Column
    public int getUser_friend() {
        return user_friend;
    }

    public void setUser_friend(int userFriend) {
        user_friend = userFriend;
    }

    @Column
    public int getUser_energy() {
        return user_energy;
    }

    public void setUser_energy(int userEnergy) {
        user_energy = userEnergy;
    }

    @Column
    public int getUser_healthpoint() {
        return user_healthpoint;
    }

    public void setUser_healthpoint(int userHealthpoint) {
        user_healthpoint = userHealthpoint;
    }

    @Column
    public int getUser_hideAttack() {
        return user_hideAttack;
    }

    public void setUser_hideAttack(int userHideAttack) {
        user_hideAttack = userHideAttack;
    }

    @Column
    public int getUser_hideDefense() {
        return user_hideDefense;
    }

    public void setUser_hideDefense(int userHideDefense) {
        user_hideDefense = userHideDefense;
    }

    @Column
    public int getUser_level() {
        return user_level;
    }

    public void setUser_level(int userLevel) {
        user_level = userLevel;
    }

    @Column
    public int getUser_money() {
        return user_money;
    }

    public void setUser_money(int userMoney) {
        user_money = userMoney;
    }

    @Column
    public int getUser_reward_Point() {
        return user_reward_Point;
    }

    public void setUser_reward_Point(int userRewardPoint) {
        user_reward_Point = userRewardPoint;
    }

    @Column
    public int getUser_skill_Point() {
        return user_skill_Point;
    }

    public void setUser_skill_Point(int userSkillPoint) {
        user_skill_Point = userSkillPoint;
    }

    @Column(length = 18)
    public String getUser_career() {
        return user_career;
    }

    public void setUser_career(String userCareer) {
        user_career = userCareer;
    }

    @Column(length = 18)
    public String getUser_country() {
        return user_country;
    }

    public void setUser_country(String usercountry) {
        user_country = usercountry;
    }

    @Column(length = 18)
    public String getUser_microblog() {
        return user_microblog;
    }

    public void setUser_microblog(String userMicroblog) {
        user_microblog = userMicroblog;
    }

    @Column
    public int getUser_fight_win() {
        return user_fight_win;
    }

    public void setUser_fight_win(int userFightWin) {
        user_fight_win = userFightWin;
    }

    @Column
    public int getUser_fight_lose() {
        return user_fight_lose;
    }

    public void setUser_fight_lose(int userFightLose) {
        user_fight_lose = userFightLose;
    }

    @Column
    public int getUser_kidnap() {
        return user_kidnap;
    }

    public void setUser_kidnap(int userKidnap) {
        user_kidnap = userKidnap;
    }

    @Column
    public int getUser_bekidnap() {
        return user_bekidnap;
    }

    public void setUser_bekidnap(int userBekidnap) {
        user_bekidnap = userBekidnap;
    }

    @Column
    public int getUser_rescue() {
        return user_rescue;
    }

    public void setUser_rescue(int userRescue) {
        user_rescue = userRescue;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((user_email == null) ? 0 : user_email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (user_email == null) {
            if (other.user_email != null)
                return false;
        } else if (!user_email.equals(other.user_email))
            return false;
        return true;
    }
}
