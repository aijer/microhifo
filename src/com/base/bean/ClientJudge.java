package com.base.bean;

import java.sql.Timestamp;

/**
 * ClientJudge entity. @author MyEclipse Persistence Tools
 */

public class ClientJudge implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer cid;
	private Integer uid;
	private Integer judge;
	private Timestamp modiifyTime;
	private Integer osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ClientJudge() {
	}

	/** minimal constructor */
	public ClientJudge(Integer id, Timestamp modiifyTime) {
		this.id = id;
		this.modiifyTime = modiifyTime;
	}

	/** full constructor */
	public ClientJudge(Integer id, Integer cid, Integer uid, Integer judge,
			Timestamp modiifyTime, Integer osn, Integer isDel) {
		this.id = id;
		this.cid = cid;
		this.uid = uid;
		this.judge = judge;
		this.modiifyTime = modiifyTime;
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

	public Integer getJudge() {
		return this.judge;
	}

	public void setJudge(Integer judge) {
		this.judge = judge;
	}

	public Timestamp getModiifyTime() {
		return this.modiifyTime;
	}

	public void setModiifyTime(Timestamp modiifyTime) {
		this.modiifyTime = modiifyTime;
	}

	public Integer getOsn() {
		return this.osn;
	}

	public void setOsn(Integer osn) {
		this.osn = osn;
	}

	public Integer getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

}