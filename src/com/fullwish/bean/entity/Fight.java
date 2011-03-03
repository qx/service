/**
 * 
 */
package com.fullwish.bean.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author fullwish
 * 
 */
@Entity
public class Fight {
    /* PK记录ID */
    private int fight_id;

    /* 发起人google */
    private User user;

    /* 目标google */
    private String fight_targetimei;

    /* pk位置 */
    private String fight_position;

    /* pk时间 */
    private Date fight_time = new Date();

    /* 是否成功 */
    private Boolean fight_result = false;

    @Id
    public int getFight_id() {
        return fight_id;
    }

    public void setFight_id(int fightId) {
        fight_id = fightId;
    }

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fight_google")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column
    public String getFight_targetimei() {
        return fight_targetimei;
    }

    public void setFight_targetimei(String fightTargetimei) {
        fight_targetimei = fightTargetimei;
    }

    @Column
    public String getFight_position() {
        return fight_position;
    }

    public void setFight_position(String fightPosition) {
        fight_position = fightPosition;
    }

    @Column
    public Date getFight_time() {
        return fight_time;
    }

    public void setFight_time(Date fightTime) {
        fight_time = fightTime;
    }

    @Column
    public Boolean getFight_result() {
        return fight_result;
    }

    public void setFight_result(Boolean fightResult) {
        fight_result = fightResult;
    }

}
