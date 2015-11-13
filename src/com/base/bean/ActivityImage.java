package com.base.bean;

import java.sql.Timestamp;

/**
 * ActivityImage entity. @author MyEclipse Persistence Tools
 */

public class ActivityImage implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer aid;
	private String image;
	private Timestamp created;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ActivityImage() {
	}

	/** minimal constructor */
	public ActivityImage(Integer id, Timestamp created) {
		this.id = id;
		this.created = created;
	}

	/** full constructor */
	public ActivityImage(Integer id, Integer aid, String image,
			Timestamp created, String osn, Integer isDel) {
		this.id = id;
		this.aid = aid;
		this.image = image;
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

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
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