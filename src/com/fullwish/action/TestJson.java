/**
 * 
 */
package com.fullwish.action;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fullwish
 *
 */
@Controller
public class TestJson extends ActionSupport {
    /**
     * 
     */
    private static final long serialVersionUID = 1901442172744219606L;

    public String execute(){
     
        System.out.println("in the acion method(TestJson)");
        return SUCCESS;
    }
}
