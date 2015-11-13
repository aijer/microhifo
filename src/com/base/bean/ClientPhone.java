package com.base.bean;

import java.sql.Timestamp;

/**
 * ClientPhone entity. @author MyEclipse Persistence Tools
 */

public class ClientPhone implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer cid;
	private String descPhone;
	private String phone;
	private Integer isDefault;
	private Integer dispOrder;
	private Timestamp created;
	private Integer isWaste;
	private Integer isMobile;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ClientPhone() {
	}

	/** minimal constructor */
	public ClientPhone(Integer id, Timestamp created) {
		this.id = id;
		this.created = created;
	}

	/** full constructor */
	public ClientPhone(Integer id, Integer cid, String descPhone, String phone,
			Integer isDefault, Integer dispOrder, Timestamp created,
			Integer isWaste, Integer isMobile, String osn, Integer isDel) {
		this.id = id;
		this.cid = cid;
		this.descPhone = descPhone;
		this.phone = phone;
		this.isDefault = isDefault;
		this.dispOrder = dispOrder;
		this.created = created;
		this.isWaste = isWaste;
		this.isMobile = isMobile;
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

	public String getDescPhone() {
		return this.descPhone;
	}

	public void setDescPhone(String descPhone) {
		this.descPhone = descPhone;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getDispOrder() {
		return this.dispOrder;
	}

	public void setDispOrder(Integer dispOrder) {
		this.dispOrder = dispOrder;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Integer getIsWaste() {
		return this.isWaste;
	}

	public void setIsWaste(Integer isWaste) {
		this.isWaste = isWaste;
	}

	public Integer getIsMobile() {
		return this.isMobile;
	}

	public void setIsMobile(Integer isMobile) {
		this.isMobile = isMobile;
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