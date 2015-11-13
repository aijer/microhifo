package com.hf.bean;
import tool.*;
public class _BaseObj {
	// 时间戳+orgid+对象id+entityid+用户id+随机数（能保证基本上不会重复）
	private int orgId;
	private int userId;
	private int objId;

	private String osn;

	public _BaseObj() {
		// TODO Auto-generated constructor stub
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getObjId() {
		return objId;
	}

	public void setObjId(int objId) {
		this.objId = objId;
	}

	public String getOsn() {
		return osn;
	}

	public void setOsn() {
//		this.osn = ObjectVersion.genObjVersion(objId, entityId, userId, System.currentTimeMillis());
//		this.osn = ObjectVersion.genObjVersion(objId, 0,	    userId, System.currentTimeMillis());
		
		
	}
	
	
	

}
