package com.base.bean;

import java.sql.Timestamp;

/**
 * ClientTixing entity. @author MyEclipse Persistence Tools
 */

public class ClientTixing implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer cid;
	private Integer uid;
	private String memo;
	private Timestamp txTime;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ClientTixing() {
	}

	/** minimal constructor */
	public ClientTixing(Integer id, Timestamp txTime) {
		this.id = id;
		this.txTime = txTime;
	}

	/** full constructor */
	public ClientTixing(Integer id, Integer cid, Integer uid, String memo,
			Timestamp txTime, String osn, Integer isDel) {
		this.id = id;
		this.cid = cid;
		this.uid = uid;
		this.memo = memo;
		this.txTime = txTime;
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

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Timestamp getTxTime() {
		return this.txTime;
	}

	public void setTxTime(Timestamp txTime) {
		this.txTime = txTime;
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