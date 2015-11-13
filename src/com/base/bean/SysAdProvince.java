package com.base.bean;

/**
 * SysAdProvince entity. @author MyEclipse Persistence Tools
 */

public class SysAdProvince implements java.io.Serializable {

	// Fields

	private Integer id;
	private String provinceId;
	private String province;
	private Integer order;

	// Constructors

	/** default constructor */
	public SysAdProvince() {
	}

	/** minimal constructor */
	public SysAdProvince(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public SysAdProvince(Integer id, String provinceId, String province,
			Integer order) {
		this.id = id;
		this.provinceId = provinceId;
		this.province = province;
		this.order = order;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

}