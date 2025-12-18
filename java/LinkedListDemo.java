//LINKEDLIST-collection of nodes,where each node consist data/element &address
//Types of LL-
//Singly LL
//Doubly LL
//circular LL

import java.util.*;

class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Vaishnavi");
		l1.add("Rutika");
		l1.add("Akshada");
		l1.add("Dhanashri");
		l1.add("Rutuja");
		
		l1.addFirst("Vaibhavi");//add element at first position
		l1.addLast("Shital");//add element at last position
		l1.push("Savita");//add element at first position

		System.out.println("LinedList: "+l1);

		System.out.println("ELement at index 5: "+l1.get(5));//retrive element at particular index
		System.out.println("First ELement: "+l1.getFirst());//retrive First element 
		System.out.println("Last ELement: "+l1.getLast());//retrive  last element

		System.out.println("peek ELement : "+l1.peek());//it will return first element of LL

		System.out.println("First ELement of peek: "+l1.peekFirst());//return First element and null if empty 
		System.out.println("Last ELement of peek: "+l1.peekLast());//return last element and null if empty

	}
}

//remove()-it remove first element =poll()
//remove(index)-remove element at specific index
//removeFirst()remove first element=pollFirst
//removeLast()-remove last element=pollLast()
//contains(),indexOf,size(),toArray(),clone(),offer()
