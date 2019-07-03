package com.algorithm.iorw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class read {
	public static void main(String[] args) {
		read();
		charSort();
	}

	private static void read() {
		String pathname = "C:/Users/759201272/Desktop/222.txt"; 
		try {
			FileInputStream reader = new FileInputStream(pathname);
			InputStreamReader inputStreamReader = new InputStreamReader(reader,"utf-8");
			BufferedReader br = new BufferedReader(inputStreamReader);
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
            	if("#".equals(line.substring(0, 1))) {
            		// 一次读入一行数据
            		System.out.println(line);
            	}else {
            		System.out.println("没#号"+line);
            	}
            }	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void charSort() {
		char [] ch = {'a','c','b','d','c','b','j','c','b','e','c','v'};
		charpr(ch);
		char temp = '0';
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length-1-i; j++) {
				if(ch[j]>ch[j+1]) {
					temp = ch[j];
					ch[j]=ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		charpr(ch);
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		int a = -1;
		for (int k = 0; k < ch.length-1; k++) {
			if(ch[k]!=ch[k+1]) {
				hashMap.put(ch[k],k-a);
				a = k;
			}
			if(k== ch.length-2) {
				if(ch[ch.length-1]!=ch[ch.length-2]) {
					hashMap.put(ch[k+1],1);
				}
			}
		}
		System.out.println(hashMap.toString());
	}
	
	
	private static void charpr(char [] ch) {
		System.out.println();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+",");
		}
	}
}
