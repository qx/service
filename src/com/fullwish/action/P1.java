/**
 * 
 */
package com.fullwish.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.fullwish.bean.entity.User;
import com.fullwish.service.user.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fullwish
 * 
 */
@Controller
public class P1 extends ActionSupport {
    /**
     * 
     */
    private static final long serialVersionUID = 903336814832481014L;

    @Resource(name = "userServiceImpl")
    UserService userService;

    private String user_google;

    private User user;

    private String user_json;// 获取客户端发送的json数据

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String execute() {
        // map.put("name", "yeeku");
        // return Action.SUCCESS;
        // user=new User("kajsd@gmail.com","woailuo",1); //test pass
        ActionContext ctx = ActionContext.getContext();
        // userService.save(user);//存入数据库
        String test = user_json.toString();
        user_google = "mygoogle@gmail.com";
        System.out.println(test);
        user = userService.find(user_google);
        // user.getUser_google()
        ctx.getSession().put("user", user);// session保存user对象信息
        System.out.println("search ok");
        return SUCCESS;
        /* {"newName":"custom","field1":null,"field2":null,"field3":null,"ints":[10,20],"map":{"name":"yeeku"}} */
    }

    public String update() {
        ActionContext ctx = ActionContext.getContext();
        ctx.getSession().put("user", "update");
        System.out.println("update");
        return SUCCESS;
    }

    public String add() {
        ActionContext ctx = ActionContext.getContext();
        ctx.getSession().put("user", "add");
        System.out.println("p1_add" + user_json);
        return SUCCESS;
    }

    //
    // public String getUser_google() {
    // return user_google;
    // }//返回值

    public void setUser_google(String user_google) {
        this.user_google = user_google;// 参数
    }

    public void setUser_json(String user_json) {
        this.user_json = user_json;
    }

}
