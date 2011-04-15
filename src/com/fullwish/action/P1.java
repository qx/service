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

    private String user_email;// 接收参数,参数名要相同(添加Setter()方法)

    private User user;// 查询到的user对象,直接返回格式如下(添加Getter()方法)

    /*
     * {"user":
     * {"user_action":0,"user_attack":0,"user_bekidnap":0,"user_carrer":null,"user_country":null,"user_defense":0,"user_email":"abc@test.com","user_energy":0,"user_experience":0,"user_fight_lose":0,"user_fight_win":0,"user_friend":0,"user_healthpoint":0,"user_hideAttack":0,"user_hideDefense":0,"user_kidnap":0,"user_level":0,"user_microblog":null,"user_money":0,"user_nickname":null,"user_password":"444bcb3a3fcf8389296c49467f27e1d6","user_rescue":0,"user_reward_Point":0,"user_skill_Point":0},"user_string":null}
     */
    private String user_string;// 返回给客户端的jsons数据,添加getter()方法:接收客户端数据setter()

    public void setUser_string(String user_string) {
        this.user_string = user_string;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String search() {
        ActionContext ctx = ActionContext.getContext();
      //  System.out.println(user_email);
        user = userService.find(user_email);
        System.out.println("p1_search+" + user);

        return SUCCESS;
    }

    /*
     * public String execute() { // map.put("name", "yeeku"); // return
     * Action.SUCCESS; // user=new User("kajsd@gmail.com","woailuo",1); //test
     * pass ActionContext ctx = ActionContext.getContext(); //
     * userService.save(user);//存入数据库 String test = user_json.toString();
     * user_google = "mygoogle@gmail.com"; System.out.println(test); user =
     * userService.find(user_google); // user.getUser_google()
     * ctx.getSession().put("user", user);// session保存user对象信息
     * System.out.println("search ok"); return SUCCESS;
     * {"newName":"custom","field1":null,"field2":null,"field3":null,"ints":[10,20],"map":{"name":"yeeku"}} }
     */

    public String update() {
        ActionContext ctx = ActionContext.getContext();
        ctx.getSession().put("user", "update");
        System.out.println("p1_update  " + user_string);
        return SUCCESS;
    }

    /*
     * public String add() { ActionContext ctx = ActionContext.getContext();
     * ctx.getSession().put("user", "add"); System.out.println("p1_add" +
     * user_json); return SUCCESS; }
     */
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_string() {
        return user_string;
    }

}
