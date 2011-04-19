/**
 * 
 */
package com.fullwish.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;

import com.fullwish.bean.entity.User;
import com.fullwish.service.user.UserService;
import com.fullwish.utils.JsonUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fullwish
 * 
 */
@Controller
public class Login extends ActionSupport {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Resource(name = "userServiceImpl")
    UserService userService;

    private User user;

    // data+ user + ssid
    private String user_response;// 返回给客户端的json,只保存get方法,返回给客户端的数据包括数据和会话识别和保持标志

    private String user_string;// 获取客户端发送的json数据

    // private JSONObject user_json;// 由user_string转过来

    public void setUser_string(String user_string) {
        this.user_string = user_string;
    }

    @SuppressWarnings("unchecked")
    public String login() {// login
        HashMap<String, String> user_map = new HashMap<String, String>();
        // ctx.getSession().put("user",user);放入session信息
        ActionContext ctx = ActionContext.getContext();
        System.out.println("login");
        String user_email = null;
        String user_password = null;
        /* 获取sessionid,用于保存用户属性 */
        HttpServletRequest request = ServletActionContext.getRequest();
        String ssid = request.getSession().getId();
        try {
            JSONObject user_json = new JSONObject(user_string);
            user_email = user_json.getString("user_email");
            user_password = user_json.getString("user_password");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        boolean check_pass = userService.checkUser(user_email, user_password);
        if (check_pass) {
            ctx.getSession().clear();
            ctx.getSession().put("user", user_email);
            /* 客户端返回的数据转化为json */
            user_map.put("user", user_email);
            user_map.put("ssid", ssid);
            user_response = JsonUtil.map2Json((Map) user_map);
            return SUCCESS;
        } else {
            ctx.getSession().clear();
            user_map.put("user", "");
            user_map.put("ssid", ssid);
            user_map.put("error_message", "用户名或密码错误");
            user_response = JsonUtil.map2Json((Map) user_map);
            return SUCCESS;
        }
    }

    // System.out.println(user_string);
    // return SUCCESS;
    /* {"newName":"custom","field1":null,"field2":null,"field3":null,"ints":[10,20],"map":{"name":"yeeku"}} */
    public String update() {
        ActionContext ctx = ActionContext.getContext();
        ctx.getSession().put("user", "update");
        System.out.println("update");
        return SUCCESS;
    }

    public String add() {// register
        ActionContext ctx = ActionContext.getContext();
        // 获取user_json值
        user = new User();
        try {
            JSONObject user_json = new JSONObject(user_string);
            user.setUser_email(user_json.getString("user_email"));
            user.setUser_password(user_json.getString("user_password"));
            user.setUser_action(3);
            user.setUser_energy(10);
            user.setUser_healthpoint(100);
            user.setUser_level(1);
            user.setUser_visible(true);
            userService.save(user);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        // ctx.getSession().put("user", "add");
        return SUCCESS;
    }

    public String getUser_response() {
        return user_response;
    }

}
