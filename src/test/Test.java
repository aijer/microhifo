package test;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.base.bean.*;
import com.base.dao.*;


public class Test {
	
	





	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		List<SysOrg> plist;
		SysOrgDao p = (SysOrgDao) ac.getBean("SysOrgDao");
		SysOrg sp=new SysOrg();
		sp.setId(0);
		sp.setName("内蒙汇发");
		sp.setOrgId(4);
		p.merge(sp);
//		p.save(sp);
		
		
		System.out.println(System.currentTimeMillis());

	}



}
