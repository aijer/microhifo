package com.base.bean;

import java.sql.Timestamp;

/**
 * UserCheckwork entity. @author MyEclipse Persistence Tools
 */

public class UserCheckwork implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String date;
	private Timestamp onTime;
	private String onAddress;
	private String onGps;
	private Timestamp offTime;
	private String offAddress;
	private String offGps;

	// Constructors

	/** default constructor */
	public UserCheckwork() {
	}

	/** minimal constructor */
	public UserCheckwork(Integer id, Timestamp onTime, Timestamp offTime) {
		this.id = id;
		this.onTime = onTime;
		this.offTime = offTime;
	}

	/** full constructor */
	public UserCheckwork(Integer id, Integer uid, String date,
			Timestamp onTime, String onAddress, String onGps,
			Timestamp offTime, String offAddress, String offGps) {
		this.id = id;
		this.uid = uid;
		this.date = date;
		this.onTime = onTime;
		this.onAddress = onAddress;
		this.onGps = onGps;
		this.offTime = offTime;
		this.offAddress = offAddress;
		this.offGps = offGps;
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

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Timestamp getOnTime() {
		return this.onTime;
	}

	public void setOnTime(Timestamp onTime) {
		this.onTime = onTime;
	}

	public String getOnAddress() {
		return this.onAddress;
	}

	public void setOnAddress(String onAddress) {
		this.onAddress = onAddress;
	}

	public String getOnGps() {
		return this.onGps;
	}

	public void setOnGps(String onGps) {
		this.onGps = onGps;
	}

	public Timestamp getOffTime() {
		return this.offTime;
	}

	public void setOffTime(Timestamp offTime) {
		this.offTime = offTime;
	}

	public String getOffAddress() {
		return this.offAddress;
	}

	public void setOffAddress(String offAddress) {
		this.offAddress = offAddress;
	}

	public String getOffGps() {
		return this.offGps;
	}

	public void setOffGps(String offGps) {
		this.offGps = offGps;
	}

}