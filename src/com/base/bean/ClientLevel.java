package com.base.bean;

/**
 * ClientLevel entity. @author MyEclipse Persistence Tools
 */

public class ClientLevel implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer cid;
	private Integer type;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ClientLevel() {
	}

	/** minimal constructor */
	public ClientLevel(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ClientLevel(Integer id, Integer uid, Integer cid, Integer type,
			String osn, Integer isDel) {
		this.id = id;
		this.uid = uid;
		this.cid = cid;
		this.type = type;
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

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
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

}