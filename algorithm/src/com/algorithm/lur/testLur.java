package com.algorithm.lur;

public class testLur {
	public static void main(String[] args) {
		lur<Object, Object> lur = new lur<>(10);
		lur.put("1", "1");
		lur.put("2", "2");
		lur.put("3", "3");
		lur.put("4", "4");
		lur.put("5", "5");
		lur.put("6", "6");
		lur.put("7", "7");
		lur.put("8", "8");
		lur.put("9", "9");
		lur.put("10", "10");
		lur.put("11", "10");
		lur.put("12", "10");
		lur.put("13", "10");
		lur.put("14", "10");
		System.out.println(lur.toString());
		lur.put("55", "10");
		lur.put("56", "10");
		lur.put("58", "10");
		lur.put("54", "10");
		System.out.println(lur.toString());
	}
}
