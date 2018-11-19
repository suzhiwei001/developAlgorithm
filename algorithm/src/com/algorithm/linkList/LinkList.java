package com.algorithm.linkList;
//定义链表
public class LinkList {
	public Node head;//链表对象
	/**
	 * 首先创建链表对象，在这里其实就是一个节点
	 * 然后创建一个旧的节点对象
	 * 把旧节点对象挂到链表节点上
	 * 在循环创建新节点，给节点赋值，并且把新节点挂到旧节点下边
	 * 此时创建好的新节点，就变为旧节点，把new出来的新节点付给旧节点就好了。
	 * 循环操作，创建链表
	 */
	public void createLinkList(int [] x) {
		Node newNode;//新节点
		Node nodeTail = new Node();
		head  = nodeTail;
		for (int i = 0; i < x.length; i++) {
			newNode = new Node();
			newNode.setData(x[i]);
			nodeTail.setNext(newNode);
			nodeTail = newNode;
		}
	}
	/**
	 * 正常输出链表内容
	 * 首先得到链表的下一个节点
	 * 判断此节点师为空，不为空输出
	 * 然后得到此时节点的下一个节点，付给变量输出
	 */
	public void displayLinkList() {
		Node node = head.getNext();
		while(node != null) {
			System.out.println("正序输出节点"+node.getData());
			node = node.getNext();
		}
		System.out.println("null");
	}
	//逆序输出节点
	public void reverseLinkList() {
		/**
		 * 首先判断链表节点，与链表的第一个节点是不是空，空的就不在循环
		 * 如果有值
		 * 
		 */
		if(head == null || head.getNext()== null) {
			return;
		}else {
			Node p = head.getNext();//链表的第一个节点
			Node q = head.getNext().getNext();//链表的第二的节点
			p.setNext(null);//因为第一个节点需要移到最后，所以给他的参数，next赋值为空
			Node temp = null;//定义一个中间节点，
			while(q!=null) {//如果第二个节点不为空
				temp = q.getNext();//把第三个节点付给中间变量
				q.setNext(p);//然后把他引用变为第一个节点
				p = q;//然后把第二个节点付给第一个节点的位置
				q = temp;//把中间变量的值赋值给第二个节点对象，也就是刚才的第一个节点
			}
			if(q == null) {//如果下一个节点时空，把上一个节点赋值个链表
				head.setNext(p);
				q = null;
				
			}
		}
	}
}
