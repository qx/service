/**
 * 
 */
package com.fullwish.action.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.fullwish.bean.entity.Mission;
import com.fullwish.service.mission.MissionService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fullwish
 * 
 */
@Controller
public class MissionServer extends ActionSupport {
    /**
     * 
     */
    private static final long serialVersionUID = -6310224311290570208L;

    private String mission_id;

    private String mission_level;

    private String mission_exp;

    @Resource(name = "missionServiceImpl")
    MissionService missionService;

    // 访问路径 192.168.2.3:8080/server_controller/skills_add
    public String add() {
        System.out.println("MissionServer add method start");
        System.out.println(mission_level);
        System.out.println(mission_exp);
        System.out.println("MissionServer add method over");
        return "addpage";
    }

    // 访问路径 192.168.2.3:8080/server_controller/skills_addfinish
    public String addfinish() {
        System.out.println("MissionServer addfinish method start");
        // 创建mission
        Mission mission = new Mission();
        String missionId = mission_id;
        int missionExp = Integer.parseInt(mission_exp);
        int missionLevel = Integer.parseInt(mission_level);
        Boolean mission_visible = true;

        mission.setMission_exp(missionExp);
        mission.setMission_id(missionId);
        mission.setMission_level(missionLevel);
        mission.setMission_visible(mission_visible);

        missionService.save(mission);

        System.out.println(mission_id);
        System.out.println(mission_level);
        System.out.println(mission_exp);
        System.out.println("MissionServer addfinish method over");
        return "addfinish";
    }

    public void setMission_exp(String mission_exp) {
        this.mission_exp = mission_exp;
    }

    public void setMission_level(String mission_level) {
        this.mission_level = mission_level;
    }

    public String getMission_id() {
        return mission_id;
    }

    public void setMission_id(String mission_id) {
        this.mission_id = mission_id;
    }
}
