package com.hf.bean;

public class Address extends _BaseObj {
	int type; // 1:省 2：市 3：区
	int id;
	String name;

	public Address(int type, int id, String name) {
		super();
		this.type = type;
		this.id = id;
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
