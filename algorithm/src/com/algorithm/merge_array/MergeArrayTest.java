package com.algorithm.merge_array;
/**
 * @author 759201272
 * 合并排序，将两个已经排序的数组合并成一个数组，其中一个数组能容下两个数组的所有元素
 */
public class MergeArrayTest {
	public static void main(String[] args) {
	    int a[]={1,2,2,8,10,0,0,0,0,0};
	    int b[]={1,2,2,7,9};
	    //注意点：长数组的测试 长度在java中得计算，因为给了很多空值，需要减去空值的长度
		MergeArray(a, a.length - b.length, b, b.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void MergeArray (int[] a,int alen,int[] b, int blen) {
		alen--;
		blen--;
		while(blen>=0) {
			if(alen<0) {
				a[alen+1] = b[blen];//最后一个数据
				break;
			}else if(a[alen]>= b[blen]) {
				a[alen + blen + 1] = a[alen];
				alen --;
			}else if(a[alen]<= b[blen]) {
				a[alen + blen + 1] = b[blen];
				blen --;
			}
		}
	}
}
