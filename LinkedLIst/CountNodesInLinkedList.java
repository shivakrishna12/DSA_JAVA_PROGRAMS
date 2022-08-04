package LinkedList;

import java.awt.List;

public class LinkedListImp {
	
	Node head;
	public static void main(String[] args){
		LinkedListImp list=new LinkedListImp();
		//creating and intilizing Nodes
		list.head=new Node(10);
		Node node2=new Node(20);
		Node node3=new Node(30);
		Node node4=new Node(40);
		//Linking the nodes
	
		list.head.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		//printing the nodes iterating one by one 
		Node curr=list.head;
		int count=0;
		 while(curr !=null){
			 System.out.println(curr.data);
			 curr=curr.next;
			 count++;
		 }
		 System.out.println("Count of Nodes :"+count);
		
	}

}
