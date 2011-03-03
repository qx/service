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
public class Mission {
    /* 任务名(主) */
    private String mission_id;

    /* 任务等级 */
    private int mission_level;

    /* 任务经验 */
    private int mission_exp;

    @Id
    public String getMission_id() {
        return mission_id;
    }

    public void setMission_id(String missionId) {
        mission_id = missionId;
    }

    @Column
    public int getMission_level() {
        return mission_level;
    }

    public void setMission_level(int missionLevel) {
        mission_level = missionLevel;
    }

    @Column
    public int getMission_exp() {
        return mission_exp;
    }

    public void setMission_exp(int missionExp) {
        mission_exp = missionExp;
    }

}
