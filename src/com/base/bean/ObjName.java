package com.base.bean;

/**
 * ObjName entity. @author MyEclipse Persistence Tools
 */

public class ObjName implements java.io.Serializable {

	// Fields

	private Integer id;
	private String objName;
	private Integer isHistory;
	private Integer isProtect;
	private Integer isPrivate;
	private Integer isExportable;

	// Constructors

	/** default constructor */
	public ObjName() {
	}

	/** minimal constructor */
	public ObjName(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ObjName(Integer id, String objName, Integer isHistory,
			Integer isProtect, Integer isPrivate, Integer isExportable) {
		this.id = id;
		this.objName = objName;
		this.isHistory = isHistory;
		this.isProtect = isProtect;
		this.isPrivate = isPrivate;
		this.isExportable = isExportable;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObjName() {
		return this.objName;
	}

	public void setObjName(String objName) {
		this.objName = objName;
	}

	public Integer getIsHistory() {
		return this.isHistory;
	}

	public void setIsHistory(Integer isHistory) {
		this.isHistory = isHistory;
	}

	public Integer getIsProtect() {
		return this.isProtect;
	}

	public void setIsProtect(Integer isProtect) {
		this.isProtect = isProtect;
	}

	public Integer getIsPrivate() {
		return this.isPrivate;
	}

	public void setIsPrivate(Integer isPrivate) {
		this.isPrivate = isPrivate;
	}

	public Integer getIsExportable() {
		return this.isExportable;
	}

	public void setIsExportable(Integer isExportable) {
		this.isExportable = isExportable;
	}

}