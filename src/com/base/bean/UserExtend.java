package com.base.bean;

import java.sql.Timestamp;

/**
 * UserExtend entity. @author MyEclipse Persistence Tools
 */

public class UserExtend implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer crmid;
	private String openid;
	private String unionid;
	private String truename;
	private String psw;
	private Integer changer;
	private Timestamp changed;
	private Integer state;
	private String osn;
	private Integer isDel;

	// Constructors

	/** default constructor */
	public UserExtend() {
	}

	/** minimal constructor */
	public UserExtend(Integer id, Timestamp changed) {
		this.id = id;
		this.changed = changed;
	}

	/** full constructor */
	public UserExtend(Integer id, Integer uid, Integer crmid, String openid,
			String unionid, String truename, String psw, Integer changer,
			Timestamp changed, Integer state, String osn, Integer isDel) {
		this.id = id;
		this.uid = uid;
		this.crmid = crmid;
		this.openid = openid;
		this.unionid = unionid;
		this.truename = truename;
		this.psw = psw;
		this.changer = changer;
		this.changed = changed;
		this.state = state;
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

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getCrmid() {
		return this.crmid;
	}

	public void setCrmid(Integer crmid) {
		this.crmid = crmid;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getTruename() {
		return this.truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public String getPsw() {
		return this.psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public Integer getChanger() {
		return this.changer;
	}

	public void setChanger(Integer changer) {
		this.changer = changer;
	}

	public Timestamp getChanged() {
		return this.changed;
	}

	public void setChanged(Timestamp changed) {
		this.changed = changed;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
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