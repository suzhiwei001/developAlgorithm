package com.algorithm.series;
/**
 * 斐波那契数列（Fibonacci sequence），
 * 又称黄金分割数列，因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，故又称为“兔子数列”。
 * 具体是这样一个数列：1、1、2、3、5、8、13、21、34、……在数学上，
 * 斐波纳契数列以如下被以递推的方法定义：F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 * 在现代物理、准晶体结构、化学等领域，斐波纳契数列都有直接的应用，为此，美国数学会从1963年起出版了以
 * 《斐波纳契数列季刊》为名的一份数学杂志，用于专门刊载这方面的研究成果。
 * @author 759201272
 *
 */
public class peiduonaqi {
	public static void main(String[] args) {
		System.out.println(peiRecursion(10));
		System.out.println(peiLoop(10));
	}
	/**
	 * 递归(Recursion)实现
	 * @param
	 */
	public static int peiRecursion(int n) {
		if(1==n||2==n) {
			return 1;
		}else {
			return peiRecursion(n-1)+peiRecursion(n-2);
		}
	}
	/**
	 * 循环实现
	 */
	public static int peiLoop(int n) {
		if(1==n||2==n) {
			return 1;
		}else {
			int a = 1,b=1,c=0;
			for(int i = 3;i<=n;i++) {
				c = a + b;
				a = b;
				b = c;
			}
			return c;
		}
	}
}
