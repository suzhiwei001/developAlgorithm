package com.algorithm.enum_test;

import java.util.EnumMap;
import java.util.EnumSet;
/**
 * 枚举测试，
 */
public class EnumTest {
	public static void main(String[] args) {
		new TestTraversalEnum();
		new TestEnumMap();
		new TestEnumSet();
	}
}

/**
 * 演示枚举类型的遍历
 */
class TestTraversalEnum{
	{
		LightTest[] values = LightTest.values();
		for (LightTest lightTest : values) {
			System.out.println(
			"顺序："+lightTest.ordinal()+
			"---名称："+lightTest.name()+
			"---取值："+lightTest
			);
		}	
	}
}
/**
 * 演示 EnumMap 的使用， EnumMap 跟 HashMap 的使用差不多，只不过 key 要是枚举类型
 */
class TestEnumMap{
	{
		EnumMap<LightTest, String> enumMap = new EnumMap<LightTest,String>(LightTest.class);
		enumMap.put(LightTest.RED, "红色");
		enumMap.put(LightTest.GREEN, "绿色");
		enumMap.put(LightTest.YELLOW, "黄色");
		for (LightTest lightTest : LightTest.values()) {
			System.out.println(
					"名称："+lightTest.name()+
					"---取值："+enumMap.get(lightTest)
					);
		}
	}
}
/**
 * 演示 EnumSet 如何使用， EnumSet 是一个抽象类，获取一个类型的枚举类型内容<BR/>
 * 可以使用 allOf 方法
 */
class TestEnumSet{
	{
		EnumSet<LightTest> enumSet = EnumSet.allOf(LightTest.class);
		for (LightTest lightTest : enumSet) {
			System. out .println( " 当前 EnumSet 中数据为： " + lightTest);
		}
	}
}

