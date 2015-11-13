package com.base.bean;

import java.sql.Timestamp;

/**
 * ObjHistory entity. @author MyEclipse Persistence Tools
 */

public class ObjHistory implements java.io.Serializable {

	// Fields

	private Integer id;
	private String objName;
	private String json;
	private Timestamp timestamp;
	private Integer userId;

	// Constructors

	/** default constructor */
	public ObjHistory() {
	}

	/** minimal constructor */
	public ObjHistory(Integer id, Timestamp timestamp) {
		this.id = id;
		this.timestamp = timestamp;
	}

	/** full constructor */
	public ObjHistory(Integer id, String objName, String json,
			Timestamp timestamp, Integer userId) {
		this.id = id;
		this.objName = objName;
		this.json = json;
		this.timestamp = timestamp;
		this.userId = userId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObjName() {
		return this.objName;
	}

	public void setObjName(String objName) {
		this.objName = objName;
	}

	public String getJson() {
		return this.json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}