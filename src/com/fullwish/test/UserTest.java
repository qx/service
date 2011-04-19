package com.fullwish.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fullwish.bean.entity.User;
import com.fullwish.service.user.UserService;

public class UserTest {
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
        // userService.save(new User("niublaoda"));
    }

    @Test
    public void find() {
        // userService.delete("test2@gmail.com");
        User user = userService.find("test2@gmail.com");
        System.out.println(user);
        userService.delete("test2@gmail.com");
    }

    @Test
    public void check() {
        userService.checkUser("abc@test.com", "ok");
    }
}
