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
public class Tools {
    /* ����ID��(��) */
    private String tools_id;

    /* ���߹����� */
    private int tools_attack;

    /* ���߷����� */
    private int tools_defense;

    /* ����ͼƬλ�� */
    private String tools_pic;

    /* �Ƿ����� */
    private Boolean tools_spe = false;

    /* ά���� */
    private int tools_keep;

    /* װ���ȼ� */
    private int tools_level;

    @Id
    public String getTools_id() {
        return tools_id;
    }

    public void setTools_id(String toolsId) {
        tools_id = toolsId;
    }
    @Column
    public int getTools_attack() {
        return tools_attack;
    }

    public void setTools_attack(int toolsAttack) {
        tools_attack = toolsAttack;
    }
    @Column
    public int getTools_defense() {
        return tools_defense;
    }

    public void setTools_defense(int toolsDefense) {
        tools_defense = toolsDefense;
    }
    @Column
    public String getTools_pic() {
        return tools_pic;
    }

    public void setTools_pic(String toolsPic) {
        tools_pic = toolsPic;
    }
    @Column(nullable=false)
    public Boolean getTools_spe() {
        return tools_spe;
    }

    public void setTools_spe(Boolean toolsSpe) {
        tools_spe = toolsSpe;
    }
    @Column
    public int getTools_keep() {
        return tools_keep;
    }

    public void setTools_keep(int toolsKeep) {
        tools_keep = toolsKeep;
    }
    @Column(nullable=false)
    public int getTools_level() {
        return tools_level;
    }

    public void setTools_level(int toolsLevel) {
        tools_level = toolsLevel;
    }

}
