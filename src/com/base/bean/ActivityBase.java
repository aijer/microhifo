package com.base.bean;


import java.sql.Timestamp;

/**
 * ActivityBase entity. @author MyEclipse Persistence Tools
 */

public class ActivityBase implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer creator;
	private Timestamp created;
	private Integer areaId;
	private Integer cid;
	private Integer type;
	private String osn;
	private Integer isDel;
	private Integer state;

	// Constructors

	/** default constructor */
	public ActivityBase() {
	}

	/** minimal constructor */
	public ActivityBase(Integer id, Timestamp created) {
		this.id = id;
		this.created = created;
	}

	/** full constructor */
	public ActivityBase(Integer id, Integer creator, Timestamp created,
			Integer areaId, Integer cid, Integer type, String osn,
			Integer isDel, Integer state) {
		this.id = id;
		this.creator = creator;
		this.created = created;
		this.areaId = areaId;
		this.cid = cid;
		this.type = type;
		this.osn = osn;
		this.isDel = isDel;
		this.state = state;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
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

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}