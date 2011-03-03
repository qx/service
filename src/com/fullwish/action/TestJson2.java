/**
 * 
 */
package com.fullwish.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fullwish
 * 
 */
@Controller
public class TestJson2 extends ActionSupport {
    // 封装请求参数的三个属性 　　
    private String field1; //null

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    private transient String field2;

    private String field3;

    // 封装处理结果的属性
    private int[] ints = { 10, 20 };

    private Map map = new HashMap();

    private String customName = "custom";

    // 三个请求参数对应的setter和getter方法
    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    // 此处省略了field1和field2两个字段的setter和getter方法
    // 封装处理结果的属性的setter和getter方法
    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    // 使用注释语法来改变该属性序列化后的属性名
    //总是会在第一行显示,其余出现位置按顺序排列
    @JSON(name = "newName")
    public String getCustomName() {
        return this.customName;
    }

    public String execute() {
        map.put("name", "yeeku");
        // return Action.SUCCESS;
        return SUCCESS;
     /*   {"newName":"custom","field1":null,"field2":null,"field3":null,"ints":[10,20],"map":{"name":"yeeku"}}*/
    }
}
