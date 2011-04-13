/**
 * 
 */
package com.fullwish.action;

import javax.annotation.Resource;

import org.json.JSONException;
import org.json.JSONObject;
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
public class Login extends ActionSupport {

    @Resource(name = "userServiceImpl")
    UserService userService;

    private User user;

    private String user_string;// 获取客户端发送的json数据

    private JSONObject user_json;// 由user_string转过来
    public void setUser_string(String user_string) {
        this.user_string = user_string;
    }

    public String login() {// login
                            // ctx.getSession().put("user",user);放入session信息
        ActionContext ctx = ActionContext.getContext();
        System.out.println(user_string);
        try {
            JSONObject user_json=new JSONObject(user_string);
           // userService.checkUser(user_json.getString("user_email"),user_json.getString("user_password"));
       userService.checkUser("abc@test.com", "ok");
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(user_string);
        return SUCCESS;
        /* {"newName":"custom","field1":null,"field2":null,"field3":null,"ints":[10,20],"map":{"name":"yeeku"}} */
    }

    public String update() {
        ActionContext ctx = ActionContext.getContext();
        ctx.getSession().put("user", "update");
        System.out.println("update");
        return SUCCESS;
    }

    public String add() {// register
        ActionContext ctx = ActionContext.getContext();
        // 获取user_json值
        //
        user = new User();
        try {
            JSONObject user_json = new JSONObject(user_string);
            user.setUser_email(user_json.getString("user_email"));
            user.setUser_password(user_json.getString("user_password"));
            userService.save(user);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        // ctx.getSession().put("user", "add");
        return SUCCESS;
    }

}
