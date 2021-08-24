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
	
	public void insertNodeAfterSpecificValue(int myNode,INode<K> newNode) {
		INode<K> tempNode = head;
		while(tempNode != null) {
			if((Integer)tempNode.getKey() == myNode) {
				INode<K> next = tempNode.getNext();
				tempNode.setNext(newNode);
				newNode.setNext(next);
				if(tempNode.equals(tail)) {
					tail = newNode;
				}
				break;
			}
			tempNode = tempNode.getNext();
		}
	}
	public void pop() {
		INode<K> tempNode = this.head;
		this.head = head.getNext();
	}
	
	public void popLast() {
		INode<K> tempNode = this.head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		tail = tempNode;
		tempNode.setNext(null);	
	}
	
	public void searchNode(int myNode){
		int index = 0;
		INode<K> tempNode = this.head;
		while(tempNode != null) {
			if((Integer)tempNode.getKey() == myNode) {
				System.out.println((myNode + " key found at Index "+index));
				break;
			}
			tempNode = tempNode.getNext();
			index++;			
		} 
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
