package com.base.bean;

import java.sql.Timestamp;

/**
 * UserBase entity. @author MyEclipse Persistence Tools
 */

public class UserBase implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private Timestamp created;
	private String osn;
	private Integer isDel;
	private Integer isCheck;

	// Constructors

	/** default constructor */
	public UserBase() {
	}

	/** minimal constructor */
	public UserBase(Integer id, Timestamp created) {
		this.id = id;
		this.created = created;
	}

	/** full constructor */
	public UserBase(Integer id, String username, Timestamp created, String osn,
			Integer isDel, Integer isCheck) {
		this.id = id;
		this.username = username;
		this.created = created;
		this.osn = osn;
		this.isDel = isDel;
		this.isCheck = isCheck;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Integer getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(Integer isCheck) {
		this.isCheck = isCheck;
	}

}