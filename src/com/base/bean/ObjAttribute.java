package com.base.bean;

import java.sql.Timestamp;

/**
 * ObjAttribute entity. @author MyEclipse Persistence Tools
 */

public class ObjAttribute implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer orgId;
	private String objName;
	private String attrName;
	private String tblName;
	private String fldName;
	private Integer attrType;
	private Timestamp created;
	private Integer isStop;
	private Timestamp stoptime;

	// Constructors

	/** default constructor */
	public ObjAttribute() {
	}

	/** minimal constructor */
	public ObjAttribute(Integer id, Timestamp created, Timestamp stoptime) {
		this.id = id;
		this.created = created;
		this.stoptime = stoptime;
	}

	/** full constructor */
	public ObjAttribute(Integer id, Integer orgId, String objName,
			String attrName, String tblName, String fldName, Integer attrType,
			Timestamp created, Integer isStop, Timestamp stoptime) {
		this.id = id;
		this.orgId = orgId;
		this.objName = objName;
		this.attrName = attrName;
		this.tblName = tblName;
		this.fldName = fldName;
		this.attrType = attrType;
		this.created = created;
		this.isStop = isStop;
		this.stoptime = stoptime;
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

	public String getObjName() {
		return this.objName;
	}

	public void setObjName(String objName) {
		this.objName = objName;
	}

	public String getAttrName() {
		return this.attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getTblName() {
		return this.tblName;
	}

	public void setTblName(String tblName) {
		this.tblName = tblName;
	}

	public String getFldName() {
		return this.fldName;
	}

	public void setFldName(String fldName) {
		this.fldName = fldName;
	}

	public Integer getAttrType() {
		return this.attrType;
	}

	public void setAttrType(Integer attrType) {
		this.attrType = attrType;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Integer getIsStop() {
		return this.isStop;
	}

	public void setIsStop(Integer isStop) {
		this.isStop = isStop;
	}

	public Timestamp getStoptime() {
		return this.stoptime;
	}

	public void setStoptime(Timestamp stoptime) {
		this.stoptime = stoptime;
	}

}