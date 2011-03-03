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
public class Care {
    /* 记录ID */
    private int care_id;

    /* 微博账号 */
//    private String care_account;
    private User user;

    /* 关注我的人账号 */
    private String care_becare;

    @Id
    public int getCare_id() {
        return care_id;
    }

    public void setCare_id(int careId) {
        care_id = careId;
    }
//    @Column(length=18,nullable=false)
//    public String getCare_account() {
//        return care_account;
//    }
//
//    public void setCare_account(String careAccount) {
//        care_account = careAccount;
//    }
    @Column(length=18)
    public String getCare_becare() {
        return care_becare;
    }

    public void setCare_becare(String careBecare) {
        care_becare = careBecare;
    }
    @ManyToOne(cascade=CascadeType.REFRESH)
    @JoinColumn(name="care_account")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
