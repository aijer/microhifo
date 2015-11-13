package com.base.bean;

import java.sql.Timestamp;

/**
 * ActivityExtend entity. @author MyEclipse Persistence Tools
 */

public class ActivityExtend implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer aid;
	private Integer creator;
	private Timestamp created;
	private String discription;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ActivityExtend() {
	}

	/** minimal constructor */
	public ActivityExtend(Integer id, Timestamp created) {
		this.id = id;
		this.created = created;
	}

	/** full constructor */
	public ActivityExtend(Integer id, Integer aid, Integer creator,
			Timestamp created, String discription, String osn, Integer isDel) {
		this.id = id;
		this.aid = aid;
		this.creator = creator;
		this.created = created;
		this.discription = discription;
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

	public Integer getCreator() {
		return this.creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public String getDiscription() {
		return this.discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
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