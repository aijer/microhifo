package com.base.bean;

/**
 * SysAdCity entity. @author MyEclipse Persistence Tools
 */

public class SysAdCity implements java.io.Serializable {

	// Fields

	private Integer id;
	private String cityId;
	private String city;
	private String father;

	// Constructors

	/** default constructor */
	public SysAdCity() {
	}

	/** minimal constructor */
	public SysAdCity(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public SysAdCity(Integer id, String cityId, String city, String father) {
		this.id = id;
		this.cityId = cityId;
		this.city = city;
		this.father = father;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCityId() {
		return this.cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFather() {
		return this.father;
	}

	public void setFather(String father) {
		this.father = father;
	}

}