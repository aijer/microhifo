package com.hf.dao;

import tool.ObjectVersion;

//时间戳+orgid+对象id+entityid+用户id+随机数
public class BaseDao {

	private int _orgId;
	private int _objId;
	private int _userId;
	private String _osn;
	private String _objName;

	

	BaseDao(int _orgId, int _objId, int _userId) {
		this._objId = _orgId;
		this._orgId = _orgId;
		this._userId = _userId;
		this._osn = ObjectVersion.genObjVersion(_orgId, _objId, _userId,
				System.currentTimeMillis());
	}

	public int get_orgId() {
		return _orgId;
	}

	public void set_orgId(int _orgId) {
		this._orgId = _orgId;
	}

	public int get_objId() {
		return _objId;
	}

	public void set_objId(int _objId) {
		this._objId = _objId;
	}

	public int get_userId() {
		return _userId;
	}

	public void set_userId(int _userId) {
		this._userId = _userId;
	}

	public String get_osn() {
		return _osn;
	}

	public String get_objName() {
		return _objName;
	}

	public void set_objName(String _objName) {
		this._objName = _objName;
	}



}
