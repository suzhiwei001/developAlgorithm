package com.algorithm.tree;
/**
 * 插入排序    需要插入的数，与前面的排好序的数，进行从后往前比较，比我大，你就后移一位，继续比较，当比我小或者相等，我就站在前一个比较的位置
 * @author 759201272
 *
 */
public class TestInsertSort {
	public static void main(String[] args) {
	int [] arr = {9,8,7,6,5,4,3,1,2};
	insertSort(arr);
	prin(arr);
	}
	/**
	 * 
	 * @param a
	 */
	public static void insertSort(int[] a){
        int insertNum;//要插入的数
        for(int i=1;i<a.length;i++){//插入的次数
            insertNum=a[i];//要插入的数
            int j=i-1;//已经排序好的序列元素个数
            while(j>=0&&a[j]>insertNum){//序列从后到前循环，将大于insertNum的数向后移动一格
                a[j+1]=a[j];//元素移动一格'
                j--;
            }
            a[j+1]=insertNum;//将需要插入的数放在要插入的位置。
        }
    }
	
	public static void prin(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
	}
}