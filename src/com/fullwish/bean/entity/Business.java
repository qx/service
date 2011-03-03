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
public class Business {
    /* �����¼id */
    private int business_id;

    /* �û�google */
    private User user;

    /* ���еĲ�����ID */
    private int business_estateid;

    /* ������ */
    private int business_estate_has;

    @Id
    public int getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(int businessId) {
        business_id = businessId;
    }
    @ManyToOne(cascade=CascadeType.REFRESH)
    @JoinColumn(name="business_userid")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @Column
    public int getBusiness_estateid() {
        return business_estateid;
    }

    public void setBusiness_estateid(int businessEstateid) {
        business_estateid = businessEstateid;
    }
    @Column
    public int getBusiness_estate_has() {
        return business_estate_has;
    }

    public void setBusiness_estate_has(int businessEstateHas) {
        business_estate_has = businessEstateHas;
    }

}
