package com.base.bean;

/**
 * ClientArea entity. @author MyEclipse Persistence Tools
 */

public class ClientArea implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer cid;
	private Integer areaId;
	private String discription;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ClientArea() {
	}

	/** minimal constructor */
	public ClientArea(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ClientArea(Integer id, Integer cid, Integer areaId,
			String discription, String osn, Integer isDel) {
		this.id = id;
		this.cid = cid;
		this.areaId = areaId;
		this.discription = discription;
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

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getDiscription() {
		return this.discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
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