package com.bridgelabz.LinkedList;
import java.util.LinkedList;


public class Runner {

	public static void main(String[] args) {
		
		//Use Case 1 
		LinkedList<Integer> simpleLL = new LinkedList<Integer>();
		simpleLL.add(70);
		simpleLL.add(30);
		simpleLL.add(56);
		System.out.println(simpleLL);
		
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);
		MyNode<Integer> fourthNode = new MyNode<>(12);
		
		
		//Use Case 2
		MyLinkedList l1 = new MyLinkedList();
//		l1.add(firstNode);
//		l1.add(secondNode);
//		l1.add(thirdNode);
//		l1.print();
		
		//Use Case 3
		l1.add(thirdNode);
		l1.add(secondNode);
		l1.add(firstNode);
		l1.print();
		
		//Use Case 4
		l1.insertNode(1, fourthNode);
		l1.print();
		
		//Use Case 5
		l1.pop();
		l1.print();
		
		//Use Case 6
		l1.popLast();
		l1.print();
		
		//Use Case 7
		l1.searchNode(30);
		
		//Use Case 8
		l1.insertNodeAfterSpecificValue(30,new MyNode<>(40));
		l1.print();
	
		//Use Case 9
		l1.delete(30);
		l1.print();
		System.out.println("List Size: "+l1.size());
		
		
		//Use Case 10
		l1.add(new MyNode<>(70));
		l1.add(new MyNode<>(56));
		l1.sort();
	}

}
