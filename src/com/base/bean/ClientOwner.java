package com.base.bean;

/**
 * ClientOwner entity. @author MyEclipse Persistence Tools
 */

public class ClientOwner implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer cid;
	private Integer owner;
	private Integer isMain;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ClientOwner() {
	}

	/** minimal constructor */
	public ClientOwner(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ClientOwner(Integer id, Integer cid, Integer owner, Integer isMain,
			String osn, Integer isDel) {
		this.id = id;
		this.cid = cid;
		this.owner = owner;
		this.isMain = isMain;
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

	public Integer getOwner() {
		return this.owner;
	}

	public void setOwner(Integer owner) {
		this.owner = owner;
	}

	public Integer getIsMain() {
		return this.isMain;
	}

	public void setIsMain(Integer isMain) {
		this.isMain = isMain;
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