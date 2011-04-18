package com.fullwish.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fullwish.service.user.UserService;

public class TestUpdateInfo {
    private static UserService userService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        try {
            ApplicationContext act = new ClassPathXmlApplicationContext(
                    "beans.xml");
            userService = (UserService) act.getBean("userServiceImpl");
        } catch (RuntimeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // @Test
    // public void save() {
    // // userService.save(new User("niublaoda"));
    // }

    // @Test
    // public void check() {
    // userService.checkUser("abc@test.com", "ok");
    // }
    @Test
    public void updateInfo() {
        userService.updateUserInfo("test@gmail.com", "Îº¹ú", "Ãô½Ý", "ÎÒ");
    }
}
