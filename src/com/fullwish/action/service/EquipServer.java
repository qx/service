/**
 * 
 */
package com.fullwish.action.service;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.fullwish.bean.entity.Tools;
import com.fullwish.service.tools.ToolsService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fullwish
 * 
 */
@Controller
public class EquipServer extends ActionSupport {
    // private String tools_path;
    // private String tools_picContentType;// 得到文件的类型
    Boolean toolsSpe = false;// 判断装备是否特殊

    private Tools tools;

    private File image;// 得到上传的文件

    private String imageFileName;// 得到文件的名称(tools_id)

    private String tools_attack;// 攻击力

    private String tools_defense;// 防御力

    private String tools_pic;// 图片路径(realpath赋值)

    private String tools_spe;// 是否特殊

    private String tools_keep;// 维护费

    private String tools_level;// 装备等级

    private static final long serialVersionUID = 4361282336008727639L;

    @Resource(name = "toolsServiceImpl")
    ToolsService toolsService;

    // 访问路径 192.168.2.3:8080/server_controller/equip_add
    public String add() {
        System.out.println("EquipServer add method start");
        System.out.println(tools_attack);
        System.out.println(tools_defense);
        System.out.println(tools_pic);
        System.out.println(tools_spe);
        System.out.println(tools_keep);
        System.out.println(tools_level);
        System.out.println("EquipServer add method over");
        return "addpage";
    }

    // 访问路径 192.168.2.3:8080/server_controller/equip_addfinish
    public String addfinish() throws IOException {
        System.out.println("EquipServer addfinish method start");
        String realpath = ServletActionContext.getServletContext().getRealPath(
                "/images");
        System.out.println(realpath);
        File file = new File(realpath);
        if (!file.exists())
            file.mkdirs();
        FileUtils.copyFile(image, new File(file, imageFileName));
        String tools_id = imageFileName;// id为上传的文件名
        String tools_pic = realpath;// 文件为保存的路径
        // 创建tools
        tools = new Tools();
        int toolsAttack = Integer.parseInt(tools_attack);
        int toolsDefense = Integer.parseInt(tools_defense);
        String toolsId = tools_id;
        int toolsKeep = Integer.parseInt(tools_level);
        int toolsLevel = Integer.parseInt(tools_level);
        String toolsPic = tools_pic;

        if (Integer.parseInt(tools_spe) == 1) {
            toolsSpe = true;
        } else if (Integer.parseInt(tools_spe) == 0) {
            toolsSpe = false;
        }

        tools.setTools_attack(toolsAttack);// 设置装备攻击力
        tools.setTools_defense(toolsDefense);// 设置装备防御力
        tools.setTools_id(toolsId);// 设置装备名称
        tools.setTools_keep(toolsKeep);// 设置装备维护费
        tools.setTools_level(toolsLevel);// 设置装备等级
        tools.setTools_pic(toolsPic);// 设置装备(路径)
        tools.setTools_spe(toolsSpe);// 设置装备是否特殊
        tools.setTools_visible(true);// 设置装备是否启用
        toolsService.save(tools);
        // System.out.println(tools_path);
        System.out.println(tools_attack);
        System.out.println(tools_defense);
        System.out.println(tools_pic);
        System.out.println(tools_spe);
        System.out.println(tools_keep);
        System.out.println(tools_level);
        System.out.println("EquipServer addfinish method over");
        return "addfinish";
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getTools_attack() {
        return tools_attack;
    }

    public void setTools_attack(String tools_attack) {
        this.tools_attack = tools_attack;
    }

    public String getTools_defense() {
        return tools_defense;
    }

    public void setTools_defense(String tools_defense) {
        this.tools_defense = tools_defense;
    }

    public String getTools_keep() {
        return tools_keep;
    }

    public void setTools_keep(String tools_keep) {
        this.tools_keep = tools_keep;
    }

    public String getTools_level() {
        return tools_level;
    }

    public void setTools_level(String tools_level) {
        this.tools_level = tools_level;
    }

    public String getTools_pic() {
        return tools_pic;
    }

    public void setTools_pic(String tools_pic) {
        this.tools_pic = tools_pic;
    }

    public String getTools_spe() {
        return tools_spe;
    }

    public void setTools_spe(String tools_spe) {
        this.tools_spe = tools_spe;
    }
}
