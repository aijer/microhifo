package com.base.bean;

import java.sql.Timestamp;

/**
 * ClientGps entity. @author MyEclipse Persistence Tools
 */

public class ClientGps implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer cid;
	private Integer gid;
	private Timestamp created;

	// Constructors

	/** default constructor */
	public ClientGps() {
	}

	/** minimal constructor */
	public ClientGps(Integer id, Timestamp created) {
		this.id = id;
		this.created = created;
	}

	/** full constructor */
	public ClientGps(Integer id, Integer cid, Integer gid, Timestamp created) {
		this.id = id;
		this.cid = cid;
		this.gid = gid;
		this.created = created;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

}