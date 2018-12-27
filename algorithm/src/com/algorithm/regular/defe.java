package com.algorithm.regular;

import java.util.regex.Pattern;

public class defe {
	public static void main(String[] args) {
		boolean isInt = Pattern.compile("^-?[1-9]\\d*$").matcher("-1").find();
		System.out.println(isInt);
		boolean isDouble = Pattern.compile("^-?([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0)$").matcher("2123.2").find();
		System.out.println(isDouble);
	}
}
