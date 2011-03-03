/**
 * 
 */
package com.fullwish.bean.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.fullwish.bean.base.Profession;

/**
 * @author fullwish
 * 
 */
@Entity
public class Career {
    /* ְҵ���� */
    // private String career_name;
    private Profession career_name;

    /* Ѫ����ʼֵ */
    private int carrer_hel_ini;

    /* Ѫ���ظ�ʱ�� */
    private int carrer_hel_re;

    /* ������ʼֵ */
    private int carrer_ene_ini;

    /* �����ظ�ʱ�� */
    private int carrer_ene_re;

    /* �ƶ�����ʼֵ */
    private int carrer_act_ini;

    /* �ƶ����ظ�ʱ�� */
    private int carrer_act_re;

    /* ���ӹ����� */
    private int carrer_incAttack;

    /* ְҵ���� */
    private String carrer_detail;

    // @Enumerated(EnumType.STRING)
    // @Column(nullable = false, length = 5)
    // public Gender getGender() {
    // return gender;
    // }
    //
    // public void setGender(Gender gender) {
    // this.gender = gender;
    // }
    @Id
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 5)
    public Profession getCareer_name() {
        return career_name;
    }

    public void setCareer_name(Profession careerName) {
        career_name = careerName;
    }

    @Column
    public int getCarrer_hel_ini() {
        return carrer_hel_ini;
    }

    public void setCarrer_hel_ini(int carrerHelIni) {
        carrer_hel_ini = carrerHelIni;
    }

    @Column(nullable=false)
    public int getCarrer_hel_re() {
        return carrer_hel_re;
    }

    public void setCarrer_hel_re(int carrerHelRe) {
        carrer_hel_re = carrerHelRe;
    }

    @Column
    public int getCarrer_ene_ini() {
        return carrer_ene_ini;
    }

    public void setCarrer_ene_ini(int carrerEneIni) {
        carrer_ene_ini = carrerEneIni;
    }

    @Column(nullable=false)
    public int getCarrer_ene_re() {
        return carrer_ene_re;
    }

    public void setCarrer_ene_re(int carrerEneRe) {
        carrer_ene_re = carrerEneRe;
    }

    @Column
    public int getCarrer_act_ini() {
        return carrer_act_ini;
    }

    public void setCarrer_act_ini(int carrerActIni) {
        carrer_act_ini = carrerActIni;
    }

    @Column(nullable=false)
    public int getCarrer_act_re() {
        return carrer_act_re;
    }

    public void setCarrer_act_re(int carrerActRe) {
        carrer_act_re = carrerActRe;
    }

    @Column
    public int getCarrer_incAttack() {
        return carrer_incAttack;
    }

    public void setCarrer_incAttack(int carrerIncAttack) {
        carrer_incAttack = carrerIncAttack;
    }

    @Column
    public String getCarrer_detail() {
        return carrer_detail;
    }

    public void setCarrer_detail(String carrerDetail) {
        carrer_detail = carrerDetail;
    }

}
