package com.test.cglibtest;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

public class cglibMain {
	public static void main(String[] args) {
		//System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        enhancer.setCallback(new CglibProxyIntercepter());
        PersonService proxy= (PersonService)  enhancer.create();
        proxy.setPerson();
        proxy.setPersonss();
        proxy.getPerson("1"); 
	
	
	}
}
