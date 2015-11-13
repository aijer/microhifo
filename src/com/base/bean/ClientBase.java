package com.base.bean;

/**
 * ClientBase entity. @author MyEclipse Persistence Tools
 */

public class ClientBase implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pid;
	private Integer isPublic;
	private Integer owner;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ClientBase() {
	}

	/** minimal constructor */
	public ClientBase(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ClientBase(Integer id, Integer pid, Integer isPublic, Integer owner,
			String osn, Integer isDel) {
		this.id = id;
		this.pid = pid;
		this.isPublic = isPublic;
		this.owner = owner;
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

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(Integer isPublic) {
		this.isPublic = isPublic;
	}

	public Integer getOwner() {
		return this.owner;
	}

	public void setOwner(Integer owner) {
		this.owner = owner;
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