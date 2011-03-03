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
public class Message {
    /* /���Լ�¼ID/ */
    private int message_id;

    /* ΢���˺�ID(��) */
    private User user;

    /* �������� */
    private String message_content;

    /* ����ʱ�� */
    private Date message_time = new Date();

    /* �����ص� */
    private String message_position;

    @Id
    public int getMessage_id() {
        return message_id;
    }
    public void setMessage_id(int messageId) {
        message_id = messageId;
    }

    public void setUser(int message_id) {
        this.message_id = message_id;
    }

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "message_microblog")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column
    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String messageContent) {
        message_content = messageContent;
    }

    @Column
    public Date getMessage_time() {
        return message_time;
    }

    public void setMessage_time(Date messageTime) {
        message_time = messageTime;
    }

    @Column
    public String getMessage_position() {
        return message_position;
    }

    public void setMessage_position(String messagePosition) {
        message_position = messagePosition;
    }

 

}
