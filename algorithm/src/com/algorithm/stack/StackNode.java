package com.algorithm.stack;
/**
 * 栈节点
 * @author 759201272
 *
 */
public class StackNode {
	int data;//当前节点的值
	StackNode pre;//当前节点的前一个节点
	public StackNode(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "StackNode [data=" + data + ", pre=" + pre + "]";
	}
	
}
