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
    /* ������(��) */
    private String mission_id;

    /* ����ȼ� */
    private int mission_level;

    /* ������ */
    private int mission_exp;

    /* �Ƿ����� */
    private Boolean mission_visible;

    /**
     * 
     */
    public Mission() {
        super();
    }

    /**
     * @param mission_id
     * @param mission_level
     * @param mission_exp
     * @param mission_visible
     */
    public Mission(String mission_id, int mission_level, int mission_exp,
            Boolean mission_visible) {
        super();
        this.mission_id = mission_id;
        this.mission_level = mission_level;
        this.mission_exp = mission_exp;
        this.mission_visible = mission_visible;
    }

    @Id
    public String getMission_id() {
        return mission_id;
    }

    public void setMission_id(String missionId) {
        mission_id = missionId;
    }

    @Column(nullable = false)
    public int getMission_level() {
        return mission_level;
    }

    public void setMission_level(int missionLevel) {
        mission_level = missionLevel;
    }

    @Column(nullable = false)
    public int getMission_exp() {
        return mission_exp;
    }

    public void setMission_exp(int missionExp) {
        mission_exp = missionExp;
    }

    @Column(nullable = false)
    public Boolean getMission_visible() {
        return mission_visible;
    }

    public void setMission_visible(Boolean mission_visible) {
        this.mission_visible = mission_visible;
    }

}
