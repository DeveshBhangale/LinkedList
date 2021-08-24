package com.bridgelabz.LinkedList;


public class MyLinkedList<K> {
	
	private INode<K> head;
	private INode<K> tail;
	
	public void add(INode<K> newNode) {
		if(tail == null) {
			tail = newNode;
		}
		if(head == null) {
			head = newNode;
		}
		else {
			INode<K> tempNode = head;
			head = newNode;
			head.setNext(tempNode);
		}		
	}
	
	public void insertNode(int index, INode<K> newNode) {
		int cnt=0;
		INode<K> tempNode = head;
		while(cnt == index) {
			tempNode = tempNode.getNext();
			cnt++;
		}
		INode<K> next = tempNode.getNext();
		tempNode.setNext(newNode);
		newNode.setNext(next);
	}
	
	public INode<K> pop() {
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	public void print() {
		INode<K> tempNode = head;
		StringBuffer str = new StringBuffer("My Nodes: ");
		while(tempNode != null) {
			str.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				 str.append("->");
			tempNode = tempNode.getNext();
		}
		System.out.println(str);
	}
}
