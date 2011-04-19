package com.fullwish.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fullwish.bean.entity.Mission;
import com.fullwish.service.mission.MissionService;

public class TestMission {
    private static MissionService missionService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        try {
            ApplicationContext act = new ClassPathXmlApplicationContext(
                    "beans.xml");
            missionService = (MissionService) act.getBean("missionServiceImpl");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void delete() {
        // Mission mission = new Mission();
        String name = "��սȺ��1";
        // mission.setMission_id(name);
        missionService.delete(missionService.find(name).getMission_id());
    }

    @Test
    public void save() {
        missionService.save(new Mission("��սȺ��1", 40, 30, true));
        missionService.save(new Mission("��սȺ��2", 40, 30, true));
        missionService.save(new Mission("��սȺ��3", 40, 30, true));
        missionService.save(new Mission("��սȺ��4", 40, 30, true));
        missionService.save(new Mission("��սȺ��5", 40, 30, true));
        missionService.save(new Mission("��սȺ��6", 40, 30, true));
        missionService.save(new Mission("��սȺ��7", 40, 30, true));
    }
    /*
     * @Test public void check() { missionService.checkMission("abc@test.com",
     * "ok"); }
     */
}
