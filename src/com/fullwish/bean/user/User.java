//package com.fullwish.bean.user;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
//public class User implements Serializable {
//	private static final long serialVersionUID = 4563456L;
//
//	/* �û�ID */
//	private String username;
//	/*�û�����*/
//	private String password;//����MD5����
//
//
//    /* ��Ǯ */
//	private long money;
//
//	/* �ж��� */
//	private int action;
//
//	/* Ѫ�� */
//	private int healthpoint;
//
//	/* �ȼ� */
//
//	private int level;
//
//	/* ����ֵ */
//
//	private long experience;
//
//	/* ���Ѹ��� */
//
//	private int friendNum;
//
//	/* ������ */
//	private int attackNum;
//
//	/* ������ */
//	private int defenseNum;
//
//	/* ���ع����� */
//	private int hideAttackNum;
//
//	/* ���ط����� */
//	private int hideDefenseNum;
//
//	/* ���췽�� */
//	public User() {
//	}
//
//	public User(String username) {
//		this.username = username;
//	}
//	   @Id @Column(length=18)
//	    public String getUsername() {
//	        return username;
//	    }
//	    public void setUsername(String username) {
//	        this.username = username;
//	    }
//	   @Column(length=32,nullable=false)
//	    public String getPassword() {
//	        return password;
//	    }
//	    public void setPassword(String password) {
//	        this.password = password;
//	    }
//
//	@Column(length = 4)
//	public int getAction() {
//		return action;
//	}
//
//	public void setAction(int action) {
//		this.action = action;
//	}
//
//	@Column(length = 6)
//	public int getAttackNum() {
//		return attackNum;
//	}
//
//	public void setAttackNum(int attackNum) {
//		this.attackNum = attackNum;
//	}
//
//	@Column(length = 6)
//	public int getDefenseNum() {
//		return defenseNum;
//	}
//
//	public void setDefenseNum(int defenseNum) {
//		this.defenseNum = defenseNum;
//	}
//
//	@Column(length = 16)
//	public long getExperience() {
//		return experience;
//	}
//
//	public void setExperience(long experience) {
//		this.experience = experience;
//	}
//
//	@Column(length = 4)
//	public int getFriendNum() {
//		return friendNum;
//	}
//
//	public void setFriendNum(int friendNum) {
//		this.friendNum = friendNum;
//	}
//
//	@Column(length = 4)
//	public int getHealthpoint() {
//		return healthpoint;
//	}
//
//	public void setHealthpoint(int healthpoint) {
//		this.healthpoint = healthpoint;
//	}
//
//	@Column(length = 6)
//	public int getHideAttackNum() {
//		return hideAttackNum;
//	}
//
//	public void setHideAttackNum(int hideAttackNum) {
//		this.hideAttackNum = hideAttackNum;
//	}
//
//	@Column(length = 6)
//	public int getHideDefenseNum() {
//		return hideDefenseNum;
//	}
//
//	public void setHideDefenseNum(int hideDefenseNum) {
//		this.hideDefenseNum = hideDefenseNum;
//	}
//
//	@Column(length = 4)
//	public int getLevel() {
//		return level;
//	}
//
//	public void setLevel(int level) {
//		this.level = level;
//	}
//
//	@Column(length = 18)
//	public long getMoney() {
//		return money;
//	}
//
//	public void setMoney(long money) {
//		this.money = money;
//	}
//
//
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result
//				+ ((username == null) ? 0 : username.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		final User other = (User) obj;
//		if (username == null) {
//			if (other.username != null)
//				return false;
//		} else if (!username.equals(other.username))
//			return false;
//		return true;
//	}
//
//}
