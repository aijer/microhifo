package com.base.bean;

import java.sql.Timestamp;

/**
 * SyncPool entity. @author MyEclipse Persistence Tools
 */

public class SyncPool implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer state;
	private Integer isSync;
	private Timestamp syncTime;
	private String name;
	private String phone1;
	private String phone2;
	private Integer creator;
	private Timestamp created;
	private Timestamp submitTime;

	// Constructors

	/** default constructor */
	public SyncPool() {
	}

	/** minimal constructor */
	public SyncPool(Integer id, Timestamp syncTime, Timestamp created,
			Timestamp submitTime) {
		this.id = id;
		this.syncTime = syncTime;
		this.created = created;
		this.submitTime = submitTime;
	}

	/** full constructor */
	public SyncPool(Integer id, Integer state, Integer isSync,
			Timestamp syncTime, String name, String phone1, String phone2,
			Integer creator, Timestamp created, Timestamp submitTime) {
		this.id = id;
		this.state = state;
		this.isSync = isSync;
		this.syncTime = syncTime;
		this.name = name;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.creator = creator;
		this.created = created;
		this.submitTime = submitTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getIsSync() {
		return this.isSync;
	}

	public void setIsSync(Integer isSync) {
		this.isSync = isSync;
	}

	public Timestamp getSyncTime() {
		return this.syncTime;
	}

	public void setSyncTime(Timestamp syncTime) {
		this.syncTime = syncTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
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

	public Timestamp getSubmitTime() {
		return this.submitTime;
	}

	public void setSubmitTime(Timestamp submitTime) {
		this.submitTime = submitTime;
	}

}