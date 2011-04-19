package com.fullwish.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fullwish.bean.entity.Tools;
import com.fullwish.service.tools.ToolsService;

public class TestTools {
    private static ToolsService toolsService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        try {
            ApplicationContext act = new ClassPathXmlApplicationContext(
                    "beans.xml");
            toolsService = (ToolsService) act.getBean("toolsServiceImpl");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void delete() {
        // Tools tools = new Tools();
        String name = "张三疯1";
        // tools.setTools_id(name);
        toolsService.delete(toolsService.find(name).getTools_id());
    }

    @Test
    public void save() { // toolsService.save(new Tools("niublaoda"));
        toolsService.save(new Tools("张三疯1"));
        toolsService.save(new Tools("张三疯2"));
        toolsService.save(new Tools("张三疯3"));
        toolsService.save(new Tools("张三疯4"));
        toolsService.save(new Tools("张三疯5"));
    }

    /*
     * @Test public void check() { toolsService.checkTools("abc@test.com",
     * "ok"); }
     */
}
