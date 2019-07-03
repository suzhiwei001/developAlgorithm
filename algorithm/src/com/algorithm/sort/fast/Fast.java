package com.algorithm.sort.fast;

import java.util.Random;
/**
 * 算法思想：
 * 基于分治的思想，是冒泡排序的改进型。
 * 首先在数组中选择一个基准点（该基准点的选取可能影响快速排序的效率，后面讲解选取的方法），
 * 然后分别从数组的两端扫描数组，设两个指示标志（lo指向起始位置，hi指向末尾)，
 * 首先从后半部分开始，如果发现有元素比该基准点的值小，就交换lo和hi位置的值，
 * 然后从前半部分开始扫秒，发现有元素大于基准点的值，就交换lo和hi位置的值，
 * 如此往复循环，直到lo>=hi,然后把基准点的值放到hi这个位置。一次排序就完成了。
 * 以后采用递归的方式分别对前半部分和后半部分排序，当前半部分和后半部分均有序时该数组就自然有序了
 */
public class Fast {
	public static void main(String[] args) {
		//int [] array = new int [15];
		int [] array = {3,5,4,1,2};
/*		for (int i = 0; i < 15; i++) {
			array[i]=new Random().nextInt(15);
		}*/
		new FastTest(array,0,array.length-1);
	}
}
/**
 * @author suzhiwei
 * 快速排序测试
 */
class FastTest{
	public FastTest(int[] array,int lo,int hi) {
		sequentialOutput(array);
		sort(array,lo,hi);
		System.out.println();
		sequentialOutput(array);
	}
	
	/**
	 * 顺序
	 */
	public void sequentialOutput(int[] array) {
		for (Integer integer : array) {
			System.out.print(integer+" ");
		}
		System.out.println();
	}
	/**
	 * 正序输出，使用快速排序
	 * @param hi 
	 * @param lo 
	 */

	public int positiveOutput(int[] array, int lo, int hi) {
		
		//固定的切分方式
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){//从后半部分向前扫描
                hi--;
            }
            System.out.println(lo+"-----------"+hi);
            array[lo]=array[hi];
            sequentialOutput(array);
            while(array[lo]<=key&&hi>lo){//从前半部分向后扫描
                lo++;
            }
            System.out.println(lo+"-----------"+hi);
            array[hi]=array[lo];
            sequentialOutput(array);
        }
        array[hi]=key;
        return hi;
	}
    public void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index = positiveOutput(array,lo,hi);
        System.out.println("每次结束");
        sequentialOutput(array);
        sort(array,lo,index-1);
        sort(array,index+1,hi); 
    }
}
