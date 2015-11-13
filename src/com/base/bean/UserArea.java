package com.base.bean;

import java.sql.Timestamp;

/**
 * UserAreas entity. @author MyEclipse Persistence Tools
 */

public class UserArea implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer aid;
	private Timestamp created;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public UserArea() {
	}

	/** minimal constructor */
	public UserArea(Integer id, Timestamp created) {
		this.id = id;
		this.created = created;
	}

	/** full constructor */
	public UserArea(Integer id, Integer uid, Integer aid, Timestamp created,
			String osn, Integer isDel) {
		this.id = id;
		this.uid = uid;
		this.aid = aid;
		this.created = created;
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

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
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