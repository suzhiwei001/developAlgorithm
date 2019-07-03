package com.algorithm.tree;
public class TreeTest {
	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode();
		terrC(treeNode, 1);

	}
	
	public static void terrC(TreeNode node,int num){
		if(node.getValue() == 0) {
			node.setValue(num);
		}else {
			if(num>node.getValue()) {
				terrC(node.getNodeLeft(), num);
			}else{
				terrC(node.getNodeRight(), num);
			}
		}
	}
}
class TreeNode{
	int value;
	TreeNode NodeLeft;
	TreeNode NodeRight;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public TreeNode getNodeLeft() {
		return NodeLeft;
	}
	public void setNodeLeft(TreeNode nodeLeft) {
		NodeLeft = nodeLeft;
	}
	public TreeNode getNodeRight() {
		return NodeRight;
	}
	public void setNodeRight(TreeNode nodeRight) {
		NodeRight = nodeRight;
	}
}
