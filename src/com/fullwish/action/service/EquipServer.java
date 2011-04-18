/**
 * 
 */
package com.fullwish.action.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.fullwish.service.user.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fullwish
 * 
 */
@Controller
public class EquipServer extends ActionSupport {
    private String tools_attack;

    private String tools_defense;

    private String tools_pic;

    private String tools_spe;

    private String tools_keep;

    private String tools_level;

    private static final long serialVersionUID = 4361282336008727639L;

    @Resource(name = "userServiceImpl")
    UserService userService;

    // 访问路径 192.168.2.3:8080/server_controller/equip_add
    public String add() {
        System.out.println("EquipServer add method start");
        System.out.println(tools_attack);
        System.out.println(tools_defense);
        System.out.println(tools_pic);
        System.out.println(tools_spe);
        System.out.println(tools_keep);
        System.out.println(tools_level);
        System.out.println("EquipServer add method over");
        return "addpage";
    }
    // 访问路径 192.168.2.3:8080/server_controller/equip_addfinish
    public String addfinish() {
        System.out.println("EquipServer addfinish method start");
        System.out.println("EquipServer addfinish method over");
        return "addfinish";
    }

    public void setTools_attack(String tools_attack) {
        this.tools_attack = tools_attack;
    }

    public void setTools_defense(String tools_defense) {
        this.tools_defense = tools_defense;
    }

    public void setTools_keep(String tools_keep) {
        this.tools_keep = tools_keep;
    }

    public void setTools_level(String tools_level) {
        this.tools_level = tools_level;
    }

    public void setTools_pic(String tools_pic) {
        this.tools_pic = tools_pic;
    }

    public void setTools_spe(String tools_spe) {
        this.tools_spe = tools_spe;
    }
}
