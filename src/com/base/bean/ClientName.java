package com.base.bean;

/**
 * ClientName entity. @author MyEclipse Persistence Tools
 */

public class ClientName implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer cid;
	private String firstname;
	private String lastname;
	private String company;
	private Integer isDefault;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ClientName() {
	}

	/** minimal constructor */
	public ClientName(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ClientName(Integer id, Integer cid, String firstname,
			String lastname, String company, Integer isDefault, String osn,
			Integer isDel) {
		this.id = id;
		this.cid = cid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.company = company;
		this.isDefault = isDefault;
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

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
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