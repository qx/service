/**
 * 
 */
package com.fullwish.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.fullwish.bean.entity.User;
import com.fullwish.service.user.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fullwish
 * 
 */
@Controller
public class Index extends ActionSupport {
    @Resource(name = "userServiceImpl")
    UserService userService;

    private static final long serialVersionUID = 341L;

    @SuppressWarnings("unused")
    private User user;

    // json据get方法获得属性值
    public User getUser() {
        return userService.find("mygoogle@gmail.com");
        // return user;
    }

    // private int attackNum;

    //
    // public int getAttackNum() {
    // return attackNum;
    // }
    //
    // public void setAttackNum(int attackNum) {
    // this.attackNum = attackNum;
    // }

    public String indexMethod() {
        System.out.println("execute index aciton");
        // attackNum= user.getAttackNum();
        return "jsp";
    }
}
