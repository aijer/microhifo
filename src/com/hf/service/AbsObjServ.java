package com.hf.service;

import java.util.List;
import com.base.bean.*;

//abstract obj service
public abstract class AbsObjServ {
	//get all obj name
	abstract List<String> getAllObjName();

	//get attr froom objname
	abstract List<String> getAttrByObjName(String objName);

	// get enum's value from attrName(enum attr)
	abstract List<ObjEnumStr> getEnumStrByAttrName(String attrName);
	
	//add enum's value
	abstract void addEnum(ObjEnum objEnum,List<ObjEnumStr> objEnumStr);
	
	abstract int getIdFromObjName(String objName);
	
	
}
