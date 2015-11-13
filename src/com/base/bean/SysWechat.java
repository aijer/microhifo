package com.base.bean;

/**
 * SysWechat entity. @author MyEclipse Persistence Tools
 */

public class SysWechat implements java.io.Serializable {

	// Fields

	private String jsapiTicket;

	// Constructors

	/** default constructor */
	public SysWechat() {
	}

	/** full constructor */
	public SysWechat(String jsapiTicket) {
		this.jsapiTicket = jsapiTicket;
	}

	// Property accessors

	public String getJsapiTicket() {
		return this.jsapiTicket;
	}

	public void setJsapiTicket(String jsapiTicket) {
		this.jsapiTicket = jsapiTicket;
	}

}