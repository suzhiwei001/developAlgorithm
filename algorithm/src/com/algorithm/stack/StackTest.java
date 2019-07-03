package com.algorithm.stack;

public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		System.out.println(stack.toString());
		System.out.println(stack.pop().data);
	}
}
