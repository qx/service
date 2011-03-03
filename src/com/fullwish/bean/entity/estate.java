/**
 * 
 */
package com.fullwish.bean.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author fullwish
 * 
 */
@Entity
public class estate {
    /* �������� */
    private String estate_id;

    /* ����۸� */
    private int estate_price;

    /* ��λʱ������ */
    private int estate_income;

    /* ��Ҫ�Ĳ��������� */
    private String estate_condition;

    /* �ȼ����� */
    private int estate_level;

    @Id
    public String getEstate_id() {
        return estate_id;
    }

    public void setEstate_id(String estateId) {
        estate_id = estateId;
    }

    @Column
    public int getEstate_price() {
        return estate_price;
    }

    public void setEstate_price(int estatePrice) {
        estate_price = estatePrice;
    }

    @Column
    public int getEstate_income() {
        return estate_income;
    }

    public void setEstate_income(int estateIncome) {
        estate_income = estateIncome;
    }

    @Column(length = 18)
    public String getEstate_condition() {
        return estate_condition;
    }

    public void setEstate_condition(String estateCondition) {
        estate_condition = estateCondition;
    }

    @Column
    public int getEstate_level() {
        return estate_level;
    }

    public void setEstate_level(int estateLevel) {
        estate_level = estateLevel;
    }

}
