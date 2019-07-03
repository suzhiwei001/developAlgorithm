package com.algorithm.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
	public static <E> void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("12345");
		arrayList.add("34235");
		arrayList.add("gsdgfd");
		arrayList.add("ghhh");
		arrayList.add("uyky");
		//arrayList.forEach((ss) -> System.out.println(ss));
		arrayList.forEach(System.out::println);
	}
}