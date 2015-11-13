package com.base.bean;

import java.sql.Timestamp;

/**
 * ObjVersion entity. @author MyEclipse Persistence Tools
 */

public class ObjVersion implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer objId;
	private Integer entityId;
	private Integer creator;
	private Timestamp created;
	private Integer orgId;
	private Integer isProtected;
	private Integer isPrivate;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ObjVersion() {
	}

	/** minimal constructor */
	public ObjVersion(Integer id, Timestamp created) {
		this.id = id;
		this.created = created;
	}

	/** full constructor */
	public ObjVersion(Integer id, Integer objId, Integer entityId,
			Integer creator, Timestamp created, Integer orgId,
			Integer isProtected, Integer isPrivate, String osn, Integer isDel) {
		this.id = id;
		this.objId = objId;
		this.entityId = entityId;
		this.creator = creator;
		this.created = created;
		this.orgId = orgId;
		this.isProtected = isProtected;
		this.isPrivate = isPrivate;
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

	public Integer getObjId() {
		return this.objId;
	}

	public void setObjId(Integer objId) {
		this.objId = objId;
	}

	public Integer getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public Integer getCreator() {
		return this.creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Integer getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public Integer getIsProtected() {
		return this.isProtected;
	}

	public void setIsProtected(Integer isProtected) {
		this.isProtected = isProtected;
	}

	public Integer getIsPrivate() {
		return this.isPrivate;
	}

	public void setIsPrivate(Integer isPrivate) {
		this.isPrivate = isPrivate;
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