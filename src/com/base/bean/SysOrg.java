package com.base.bean;

/**
 * SysOrg entity. @author MyEclipse Persistence Tools
 */

public class SysOrg implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer orgId;

	// Constructors

	/** default constructor */
	public SysOrg() {
	}

	/** minimal constructor */
	public SysOrg(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public SysOrg(Integer id, String name, Integer orgId) {
		this.id = id;
		this.name = name;
		this.orgId = orgId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

}