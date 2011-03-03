/**
 * 
 */
package com.fullwish.bean.entity;

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
public class Eqstatus {
    /* 装备情况id */
    private int eqstatus_id;

    /* 用户标示 */
    private User user;

    /* 装备ID */
    private int eqstatus_equi_id;

    /* 是否装备 */
    private Boolean eqstatus_isuse;

    @Id
    public int getEqstatus_id() {
        return eqstatus_id;
    }

    public void setEqstatus_id(int eqstatusId) {
        eqstatus_id = eqstatusId;
    }

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "eqstatus_google")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column
    public int getEqstatus_equi_id() {
        return eqstatus_equi_id;
    }

    public void setEqstatus_equi_id(int eqstatusEquiId) {
        eqstatus_equi_id = eqstatusEquiId;
    }

    @Column
    public Boolean getEqstatus_isuse() {
        return eqstatus_isuse;
    }

    public void setEqstatus_isuse(Boolean eqstatusIsuse) {
        eqstatus_isuse = eqstatusIsuse;
    }

}
