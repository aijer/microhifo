package com.base.bean;

import java.sql.Timestamp;

/**
 * ObjEnum entity. @author MyEclipse Persistence Tools
 */

public class ObjEnum implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer orgId;
	private String attrName;
	private Integer enumKey;
	private Integer isDefault;
	private Integer isStop;
	private Integer dispOrder;
	private Timestamp modifytime;

	// Constructors

	/** default constructor */
	public ObjEnum() {
	}

	/** minimal constructor */
	public ObjEnum(Integer id, Timestamp modifytime) {
		this.id = id;
		this.modifytime = modifytime;
	}

	/** full constructor */
	public ObjEnum(Integer id, Integer orgId, String attrName, Integer enumKey,
			Integer isDefault, Integer isStop, Integer dispOrder,
			Timestamp modifytime) {
		this.id = id;
		this.orgId = orgId;
		this.attrName = attrName;
		this.enumKey = enumKey;
		this.isDefault = isDefault;
		this.isStop = isStop;
		this.dispOrder = dispOrder;
		this.modifytime = modifytime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getAttrName() {
		return this.attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public Integer getEnumKey() {
		return this.enumKey;
	}

	public void setEnumKey(Integer enumKey) {
		this.enumKey = enumKey;
	}

	public Integer getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getIsStop() {
		return this.isStop;
	}

	public void setIsStop(Integer isStop) {
		this.isStop = isStop;
	}

	public Integer getDispOrder() {
		return this.dispOrder;
	}

	public void setDispOrder(Integer dispOrder) {
		this.dispOrder = dispOrder;
	}

	public Timestamp getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(Timestamp modifytime) {
		this.modifytime = modifytime;
	}

}