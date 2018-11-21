package com.algorithm.regular;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
	//https://blog.csdn.net/qq_28195405/article/details/49300719
	public static void main(String[] args) {
		String ConditionStart = "4";//定义字符串的开始范围
		String ConditionEnd = "10";//定义字符的结束范围
		String str = "你好，请查看我的长度是否满足条件";
		String zhengZeStr = "[\\u4e00-\\u9fa5_a-zA-Z0-9_]{"+ConditionStart+","+ConditionEnd+"}";//匹配中文，英文字母和数字及_: 
		
		Map<String, String> hashMap = new HashMap<>();//定义传入的参数
		hashMap.put("ConditionStart",ConditionStart);//定义字符串的开始范围
		hashMap.put("ConditionEnd",ConditionEnd);//定义字符的结束范围
		hashMap.put("str", str);//传入的字符串
		hashMap.put("zhengZeStr", zhengZeStr);//正则表达式
		
		boolean checkInput = checkInput(hashMap);
		System.out.println(checkInput);
	}
    private static boolean checkInput(Map<String, String> map){
        Pattern pattern = Pattern.compile(map.get("zhengZeStr").toString());
        Matcher m = pattern.matcher(map.get("str").toString());
        int regionEnd = m.regionEnd();
        System.out.println(m.toString());
        
        if(!m.matches()){ //匹配不到,說明輸入的不符合條件
           System.out.println("不满足条件{"+map.get("ConditionStart").toString()+","+map.get("ConditionEnd").toString()+"}，检测到字符串长度为："+regionEnd);
           return false; 
        } 
        System.out.println("满足条件，检测到字符串长度为："+regionEnd);
        return true; 
    }
}
