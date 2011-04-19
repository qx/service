/**
 * 
 */
package com.fullwish.bean.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author fullwish
 * 
 */
@Entity
public class Tools implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -3144073174494749081L;

    /* 道具ID名(主) */
    private String tools_id;

    /* 道具攻击力 */
    private int tools_attack;

    /* 道具防御力 */
    private int tools_defense;

    /* 道具图片位置 */
    private String tools_pic;

    /* 是否特殊 */
    private Boolean tools_spe = false;

    /* 维护费 */
    private int tools_keep;

    /* 装备等级 */
    private int tools_level;

    /* 是否启用 */
    private Boolean tools_visible = false;

    /**
     * 
     */
    public Tools() {
        super();
    }

    /**
     * @param tools_id
     *            装备名称
     * @param tools_visible
     *            是否启用
     */
    public Tools(String tools_id) {
        super();
        this.tools_id = tools_id;
        this.tools_spe = false;// 未装备
        this.tools_visible = true;// 启用
    }

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

    @Column(nullable = false)
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

    @Column(nullable = false)
    public int getTools_level() {
        return tools_level;
    }

    public void setTools_level(int toolsLevel) {
        tools_level = toolsLevel;
    }

    @Column(nullable = false)
    public Boolean getTools_visible() {
        return tools_visible;
    }

    public void setTools_visible(Boolean tools_visible) {
        this.tools_visible = tools_visible;
    }

}
