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
    // private String tools_picContentType;// �õ��ļ�������
    Boolean toolsSpe = false;// �ж�װ���Ƿ�����

    private Tools tools;

    private File image;// �õ��ϴ����ļ�

    private String imageFileName;// �õ��ļ�������(tools_id)

    private String tools_attack;// ������

    private String tools_defense;// ������

    private String tools_pic;// ͼƬ·��(realpath��ֵ)

    private String tools_spe;// �Ƿ�����

    private String tools_keep;// ά����

    private String tools_level;// װ���ȼ�

    private static final long serialVersionUID = 4361282336008727639L;

    @Resource(name = "toolsServiceImpl")
    ToolsService toolsService;

    // ����·�� 192.168.2.3:8080/server_controller/equip_add
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

    // ����·�� 192.168.2.3:8080/server_controller/equip_addfinish
    public String addfinish() throws IOException {
        System.out.println("EquipServer addfinish method start");
        String realpath = ServletActionContext.getServletContext().getRealPath(
                "/images");
        System.out.println(realpath);
        File file = new File(realpath);
        if (!file.exists())
            file.mkdirs();
        FileUtils.copyFile(image, new File(file, imageFileName));
        String tools_id = imageFileName;// idΪ�ϴ����ļ���
        String tools_pic = realpath;// �ļ�Ϊ�����·��
        // ����tools
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

        tools.setTools_attack(toolsAttack);// ����װ��������
        tools.setTools_defense(toolsDefense);// ����װ��������
        tools.setTools_id(toolsId);// ����װ������
        tools.setTools_keep(toolsKeep);// ����װ��ά����
        tools.setTools_level(toolsLevel);// ����װ���ȼ�
        tools.setTools_pic(toolsPic);// ����װ��(·��)
        tools.setTools_spe(toolsSpe);// ����װ���Ƿ�����
        tools.setTools_visible(true);// ����װ���Ƿ�����
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
