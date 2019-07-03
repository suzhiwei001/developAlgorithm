package com.algorithm.sort.bubble;
/**
 * 插入排序
 * @author 759201272
 *	前面有已经排好序的数据，然后在排好序的数据的后一位和前面的元素比较，如果我比你小，你就向后移一位（站到我的位置），然后继续和前面一位进行比较，同理比我大你就退一位
 */
public class InsertSort {
	public static void main(String[] args) {
		int [] arr = {9,8,7,6,5,4,3,2,1};
		prin(arr);
		insertSort(arr);
		prin(arr);
	}
	public static void insertSort(int[] a){
        int length=a.length;//数组长度，将这个提取出来是为了提高速度。
        int insertNum;//要插入的数
        for(int i=1;i<length;i++){//插入的次数
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
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
	}

}
