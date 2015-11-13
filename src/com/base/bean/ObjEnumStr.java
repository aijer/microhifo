package com.base.bean;

/**
 * ObjEnumStr entity. @author MyEclipse Persistence Tools
 */

public class ObjEnumStr implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer orgId;
	private String attrName;
	private Integer enumKey;
	private String enumValue;

	// Constructors

	/** default constructor */
	public ObjEnumStr() {
	}

	/** minimal constructor */
	public ObjEnumStr(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ObjEnumStr(Integer id, Integer orgId, String attrName,
			Integer enumKey, String enumValue) {
		this.id = id;
		this.orgId = orgId;
		this.attrName = attrName;
		this.enumKey = enumKey;
		this.enumValue = enumValue;
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

	public String getEnumValue() {
		return this.enumValue;
	}

	public void setEnumValue(String enumValue) {
		this.enumValue = enumValue;
	}

}