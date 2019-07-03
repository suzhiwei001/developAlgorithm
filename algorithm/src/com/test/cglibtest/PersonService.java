package com.test.cglibtest;
/**
 * 
 * @author 759201272
 *
 */
public class PersonService {
	public PersonService() {
		
	}
	final public void getPerson(String code) {
		System.out.println("final修饰的方法-getPerson ：");
	}
	/**
	 * dsdda
	 */
	public void setPerson() {
		System.out.println("设置方法");
	}
	public void setPersonss() {
		System.out.println("设置方法====");
	}
}
