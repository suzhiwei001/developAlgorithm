package com.algorithm.sort.bubble;

public class shou {
	public static void main(String[] args) {
		int [] arr = {8,7,9,5,5,2,3,2};
		int [] temp = new int[arr.length];
		print(arr);
		mergeGroup(arr,0,arr.length-1,temp);
		print(arr);
		
	}
	
	public static void mergeGroup(int [] arr,int right,int left,int [] temp){
		if(right<left) {
			int center = (right + left)/2;
			mergeGroup(arr, right, center, temp);
			mergeGroup(arr, center+1, left, temp);
			mergeSort(arr, right, center, left, temp);
		}
	}
	public static void mergeSort(int [] arr,int right,int center,int left,int [] temp) {
		int i = 0;
		//定义左右序列的开始索引
		int rightStart = right;
		int leftStart = center+1;
		while(rightStart<=center && leftStart<=left) {
			if(arr[rightStart]< arr[leftStart]) {
				temp[i] = arr[rightStart];
				i++;
				rightStart++;
			}else {
				temp[i] = arr[leftStart];
				i++;
				leftStart++;
			}
		}
		while(rightStart<=center) {
			temp[i] =  arr[rightStart];
			i++;
			rightStart++;
		}
		while(leftStart<=left) {
			temp[i] =  arr[leftStart];
			i++;
			leftStart++;
		}
		for (int j = 0; j < i; j++) {
			arr[right+j]=temp[j];
		}
		print(temp);

	}
	
	
	public static void print(int[] arr) {
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
}
