package com.algorithm.stack;

/**
 * 栈的操作
 * 
 * @author 759201272
 *
 */
public class Stack {
	public StackNode head;
	public StackNode current;

	// 方法：入栈操作
	public void push(int data) {
		if (head == null) {
			head = new StackNode(data);
			current = head;
		} else {
			StackNode node = new StackNode(data);
			node.pre = current;// current结点将作为当前结点的前驱结点
			current = node; // 让current结点永远指向新添加的那个结点
		}
	}

	public StackNode pop() {
		if (current == null) {
			return null;
		}
		StackNode node = current; // current结点是我们要出栈的结点
		current = current.pre; // 每出栈一个结点后，current后退一位
		return node;
	}

	@Override
	public String toString() {
		return "Stack [head=" + head + ", current=" + current + "]";
	}
	
}
