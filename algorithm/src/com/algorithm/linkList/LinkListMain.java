package com.algorithm.linkList;

import java.util.Scanner;
/**
 * @ClassName LinkListMain
 * @Description 单向链表的倒序
 * @author suzhiwei
 * @date 2017年10月20日上午9:38:21
 */
public class LinkListMain {
	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		@SuppressWarnings("resource")
		Scanner scInt = new Scanner(System.in);
		System.out.print("请输入链表长度：");
		int n = scInt.nextInt();
		int [] x = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = i;
		}
		linkList.createLinkList(x);
		linkList.displayLinkList();
		linkList.reverseLinkList();
		linkList.displayLinkList();
	}
}
