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
public class Friend {
    /* ÅóÓÑ¼ÇÂ¼_id */
    private int friend_id;

    /* Ö÷google */
    private User user;

    /* ÓÑgoogle */
    private String friend_sub_google;

    @Id
    public int getFriend_id() {
        return friend_id;
    }

    public void setFriend_id(int friendId) {
        friend_id = friendId;
    }

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "friend_main_google")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column
    public String getFriend_sub_google() {
        return friend_sub_google;
    }

    public void setFriend_sub_google(String friendSubGoogle) {
        friend_sub_google = friendSubGoogle;
    }

}
