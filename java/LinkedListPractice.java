import java.util.*;
class LinkedListPractice
{
	public static void main(String args[])
	{
		LinkedList<String> l1=new LinkedList<String>();

		l1.add("Vaibhavi");
		l1.add("Dhanashri");
		l1.add("Vaishnavi");
		l1.add("Akshada");
		l1.add("Shital");

		System.out.println("Original list: "+l1);
		l1.addFirst("Vaishali");
		System.out.println("Add Element at First of List: "+l1);
		l1.addLast("Shivani");
		System.out.println("Add Element at Last of List: "+l1);
		l1.push("Savita");
		System.out.println("Push the Element: "+l1);

		l1.offer("Rutika");
        	l1.offerFirst("Diksha");
        	l1.offerLast("Mayuri");
		System.out.println("After offer methods: " + l1);	

		System.out.println("ELement at index 2: "+l1.get(2));
		System.out.println("First ELement: "+l1.getFirst());
		System.out.println("Last ELement: "+l1.getLast());

		System.out.println("peek ELement : "+l1.peek());
		System.out.println("First ELement of peek: "+l1.peekFirst());
		System.out.println("Last ELement of peek: "+l1.peekLast());

		System.out.println("Remove ELement: "+l1.remove());
		System.out.println("Remove ELement: "+l1.remove(2));
		System.out.println("Remove First ELement: "+l1.removeFirst());
		System.out.println("Remove Last ELement: "+l1.removeLast());
		System.out.println("Poll ELement: "+l1.poll());
		System.out.println("Poll First ELement: "+l1.pollFirst());
		System.out.println("Poll Last ELement: "+l1.pollLast());

		System.out.println("Contain 'Shital': "+l1.contains("Shital"));   
		System.out.println("Index Of 'Akshada': "+l1.indexOf("Akshada"));
		System.out.println("Last Index Of 'Vaibhavi': "+l1.indexOf("Vaibhavi"));
		System.out.println("Size of List: "+l1.size());
		System.out.println("Is List Empty?: " + l1.isEmpty());
		
		List sub = l1.subList(1, 4);
		System.out.println("Sub List: "+sub);

		Object[] arr1 = l1.toArray();
        	System.out.println("LinkedList to Object Array:");
        	for (Object o : arr1) {System.out.println(o);}

		LinkedList l2 = (LinkedList) l1.clone();
        	System.out.println("Original List: " + l1);
        	System.out.println("Cloned List: " + l2);	
	}
}
