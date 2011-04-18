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
public class SkillsServer extends ActionSupport {
    /**
     * 
     */
    private static final long serialVersionUID = -6310224311290570208L;

    private String mission_level;

    private String mission_exp;

    @Resource(name = "userServiceImpl")
    UserService userService;

    // 访问路径 192.168.2.3:8080/server_controller/skills_add
    public String add() {
        System.out.println("SkillsServer add method start");
        System.out.println(mission_level);
        System.out.println(mission_exp);
        System.out.println("SkillsServer add method over");
        return "addpage";
    }

    // 访问路径 192.168.2.3:8080/server_controller/skills_addfinish
    public String addfinish() {
        System.out.println("SkillsServer addfinish method start");
        System.out.println("SkillsServer addfinish method over");
        return "addfinish";
    }
}
