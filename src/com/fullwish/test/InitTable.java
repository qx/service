package com.fullwish.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fullwish.bean.entity.User;
import com.fullwish.service.user.UserService;

public class InitTable {
    private static UserService userService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        try {
            ApplicationContext act = new ClassPathXmlApplicationContext(
                    "beans.xml");
            userService = (UserService) act.getBean("userServiceImpl");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void save() {
        /*user_name user_password*/
        userService.save(new User("qx.ouyang@gmail.com","ok"));
        userService.save(new User("test@gmail.com","ok"));
        userService.save(new User("test2@gmail.com","ok"));
    }
}
