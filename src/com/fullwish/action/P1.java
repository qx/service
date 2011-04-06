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
public class P1  extends ActionSupport  {
    
    @Resource(name = "userServiceImpl")
    UserService userService;
    private String User_google;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public String execute() {
   //     map.put("name", "yeeku");
        // return Action.SUCCESS;
    //    user=new User("kajsd@gmail.com","woailuo",1); //test pass
        ActionContext ctx = ActionContext.getContext();
     //   userService.save(user);//存入数据库
       user= userService.find(User_google);
      // user.getUser_google()
        ctx.getSession().put("user", user);//session保存user对象信息
        System.out.println("search ok");
        return SUCCESS;
     /*   {"newName":"custom","field1":null,"field2":null,"field3":null,"ints":[10,20],"map":{"name":"yeeku"}}*/
    }

    public String getUser_google() {
        return User_google;
    }

    public void setUser_google(String User_google) {
        this.User_google = User_google;
    }

}
