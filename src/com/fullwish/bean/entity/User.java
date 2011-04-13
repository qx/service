/**
 * 
 */
package com.fullwish.bean.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author fullwish
 * 
 */
@Entity
public class User {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.user_email;
    }

    /* 用户邮箱,唯一标示,(取回密码) */
    private String user_email;

    /** 密码 * */
    private String user_password;// 采用MD5加密

    /* 用户昵称 */
    private String user_nickname;

    /* 行动力 */
    private int user_action;

    /* 攻击力 */
    private int user_attack;

    /* 防御力 */
    private int user_defense;

    /* 经验值 */
    private int user_experience;

    /* 朋友数量 */
    private int user_friend;

    /* 能量 */
    private int user_energy;

    /* 血量值 */
    private int user_healthpoint;

    /* 隐藏攻击力 */
    private int user_hideAttack;

    /* 隐藏防御力 */
    private int user_hideDefense;

    /* 等级 */
    private int user_level;

    /* 金钱 */
    private int user_money;

    /* 奖励点数 */
    private int user_reward_Point;

    /* 技能点数 */
    private int user_skill_Point;

    /* 职业 */
    private String user_carrer;

    /* 所属地区 */
    private String user_country;

    /* 微博账号 */
    private String user_microblog;

    /* 战斗胜利场数 */
    private int user_fight_win;

    /* 战斗失败次数 */
    private int user_fight_lose;

    /* 绑架次数 */
    private int user_kidnap;

    /* 被绑次数 */
    private int user_bekidnap;

    /* 解救次数 */
    private int user_rescue;

    public User() {

    }

    /**
     * @param user_email
     *            用户账号唯一标示,也可用作取回密码
     * @param user_password
     *            用户密码,登录游戏 创建测试数据,初始值设置如下 行动力3 user_action 攻击力0 防御力0 经验值0 朋友数量0
     *            能量:10 user_energy 血量值:100 user_healthpoint 隐藏攻击力:0 隐藏防御力:0
     *            等级:1 user_level 金钱:0 奖励点数:0 技能点数:0 职业:未定 所属势力: 微博账号:未定// 测试
     *            user_microblog="qx.ouyang@gmail.com" 战斗胜利场数:0 战斗失败场数:0 绑架次数:0
     *            被绑次数:0
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

    @Column(length = 10)
    public String getUser_carrer() {
        return user_carrer;
    }

    public void setUser_carrer(String userCarrer) {
        user_carrer = userCarrer;
    }

    @Column(length = 12)
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
