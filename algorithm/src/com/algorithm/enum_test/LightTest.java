package com.algorithm.enum_test;
/**
 *枚举可以定义变量，然后通过.values()方法得到枚举集合值，遍历取值，.values().name();名称
 */
public enum LightTest {
	// 利用构造函数传参
    RED(1), GREEN(3),YELLOW(2),fwef(2);
    // 定义私有变量
    private int nCode ;
    // 构造函数，枚举类型只能为私有
    private LightTest(int nCode) {
        this.nCode = nCode;
    }
    @Override
    public String toString() {
        return String.valueOf ( this . nCode );
    }
}
