package com.base.bean;

/**
 * ClientExtend entity. @author MyEclipse Persistence Tools
 */

public class ClientExtend implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer cid;
	private Integer nameId;
	private Integer crmId;
	private Integer type;
	private Integer isClash;
	private Integer clashType;
	private Integer isCheck;
	private Integer gpsId;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public ClientExtend() {
	}

	/** minimal constructor */
	public ClientExtend(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ClientExtend(Integer id, Integer cid, Integer nameId, Integer crmId,
			Integer type, Integer isClash, Integer clashType, Integer isCheck,
			Integer gpsId, String osn, Integer isDel) {
		this.id = id;
		this.cid = cid;
		this.nameId = nameId;
		this.crmId = crmId;
		this.type = type;
		this.isClash = isClash;
		this.clashType = clashType;
		this.isCheck = isCheck;
		this.gpsId = gpsId;
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

	public Integer getNameId() {
		return this.nameId;
	}

	public void setNameId(Integer nameId) {
		this.nameId = nameId;
	}

	public Integer getCrmId() {
		return this.crmId;
	}

	public void setCrmId(Integer crmId) {
		this.crmId = crmId;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getIsClash() {
		return this.isClash;
	}

	public void setIsClash(Integer isClash) {
		this.isClash = isClash;
	}

	public Integer getClashType() {
		return this.clashType;
	}

	public void setClashType(Integer clashType) {
		this.clashType = clashType;
	}

	public Integer getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(Integer isCheck) {
		this.isCheck = isCheck;
	}

	public Integer getGpsId() {
		return this.gpsId;
	}

	public void setGpsId(Integer gpsId) {
		this.gpsId = gpsId;
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