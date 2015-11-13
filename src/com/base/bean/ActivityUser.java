package com.base.bean;

/**
 * ActivityUser entity. @author MyEclipse Persistence Tools
 */

public class ActivityUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer aid;
	private Integer uid;
	private Integer isMain;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ActivityUser() {
	}

	/** minimal constructor */
	public ActivityUser(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ActivityUser(Integer id, Integer aid, Integer uid, Integer isMain,
			String osn, Integer isDel) {
		this.id = id;
		this.aid = aid;
		this.uid = uid;
		this.isMain = isMain;
		this.osn = osn;
		this.isDel = isDel;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getIsMain() {
		return this.isMain;
	}

	public void setIsMain(Integer isMain) {
		this.isMain = isMain;
	}

	public String getOsn() {
		return this.osn;
	}

	public void setOsn(String osn) {
		this.osn = osn;
	}

	public Integer getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

}