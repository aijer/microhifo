package test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class BeanConfigTest {
private Map orgMap;
	
	
	
	

	public Map getOrgMap() {
		return orgMap;
	}





	public void setOrgMap(Map orgMap) {
		this.orgMap = orgMap;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource rs=new ClassPathResource("bean-config.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		BeanConfigTest test=(BeanConfigTest)factory.getBean("test");
		System.out.println(test.getOrgMap().get("四川汇发"));

	}

}
