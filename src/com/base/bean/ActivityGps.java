package com.base.bean;

import java.sql.Timestamp;

/**
 * ActivityGps entity. @author MyEclipse Persistence Tools
 */

public class ActivityGps implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer aid;
	private Integer type1;
	private String xy;
	private Timestamp created;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ActivityGps() {
	}

	/** minimal constructor */
	public ActivityGps(Integer id, Timestamp created) {
		this.id = id;
		this.created = created;
	}

	/** full constructor */
	public ActivityGps(Integer id, Integer aid, Integer type1, String xy,
			Timestamp created, String osn, Integer isDel) {
		this.id = id;
		this.aid = aid;
		this.type1 = type1;
		this.xy = xy;
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

	public Integer getType1() {
		return this.type1;
	}

	public void setType1(Integer type1) {
		this.type1 = type1;
	}

	public String getXy() {
		return this.xy;
	}

	public void setXy(String xy) {
		this.xy = xy;
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