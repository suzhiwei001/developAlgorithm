package com.algorithm.sort.bubble;

import java.util.Random;
/**
 * 测试结论，冒泡排序，循环次数固定，5049次;数据交换次数不固定;
 * 时间复杂度:
 * 空间复杂度:
 * @author suzhiwei
 */
public class Bubbo {
	public static void main(String[] args) {
		int [] array = new int [100];
		for (int i = 0; i < 100; i++) {
			array[i]=new Random().nextInt(100);
		}
		new BubboTest(array);
	}
}
class BubboTest{
	public BubboTest(int[] array) {
		int a = 0;
		for (int i = 0; i < array.length-1; i++) {
			a++;
			for (int j = 0; j < array.length-1-i; j++) {
				a++;
				int temp;
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println(a+"次");
	}
}