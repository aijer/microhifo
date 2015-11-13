package com.base.bean;

import java.sql.Timestamp;

/**
 * ClientDeal entity. @author MyEclipse Persistence Tools
 */

public class ClientDeal implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer cid;
	private Integer creator;
	private Timestamp created;
	private Timestamp dealDate;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ClientDeal() {
	}

	/** minimal constructor */
	public ClientDeal(Integer id, Timestamp created, Timestamp dealDate) {
		this.id = id;
		this.created = created;
		this.dealDate = dealDate;
	}

	/** full constructor */
	public ClientDeal(Integer id, Integer cid, Integer creator,
			Timestamp created, Timestamp dealDate, String osn, Integer isDel) {
		this.id = id;
		this.cid = cid;
		this.creator = creator;
		this.created = created;
		this.dealDate = dealDate;
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

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
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

	public Timestamp getDealDate() {
		return this.dealDate;
	}

	public void setDealDate(Timestamp dealDate) {
		this.dealDate = dealDate;
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