package com.base.bean;

import java.sql.Timestamp;

/**
 * SysMsg entity. @author MyEclipse Persistence Tools
 */

public class SysMsg implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Timestamp created;
	private Integer hasRead;
	private String content;

	// Constructors

	/** default constructor */
	public SysMsg() {
	}

	/** minimal constructor */
	public SysMsg(Integer id, Timestamp created) {
		this.id = id;
		this.created = created;
	}

	/** full constructor */
	public SysMsg(Integer id, Integer uid, Timestamp created, Integer hasRead,
			String content) {
		this.id = id;
		this.uid = uid;
		this.created = created;
		this.hasRead = hasRead;
		this.content = content;
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

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Integer getHasRead() {
		return this.hasRead;
	}

	public void setHasRead(Integer hasRead) {
		this.hasRead = hasRead;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}