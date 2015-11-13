package com.hf.service;

import java.util.List;

import com.base.bean.*;
import com.hf.bean.Address;


public abstract class AbsAddrServ {
	// get all province
	public abstract List<Address> getAddress();

	// get citys by provinceId
	public abstract List<Address> getAddress(String pid) ;

	// get areas by provinceId and cityId
	public abstract List<Address> getAddress(String pid, String cid);
}
