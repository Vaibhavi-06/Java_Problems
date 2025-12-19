import java.util.*;

class TreeTest
{
	public static void main(String args[])
	{	
		TreeSet<Integer> t1=new TreeSet<Integer>();

		t1.add(23);
		t1.add(65);
		t1.add(16);
		t1.add(45);
		t1.add(26);
		t1.add(12);
		t1.add(35);

		System.out.println("TreeSet: "+t1);

		t1.pollFirst();
		t1.pollLast();
		System.out.println("TreeSet after poll: "+t1);

		System.out.println("Descending TreeSet: "+t1.descendingSet());
		System.out.println("HeadSet: "+t1.headSet(26,true));
		System.out.println("TailSet: "+t1.tailSet(26,false));
		System.out.println("SUbSet: "+t1.subSet(23,true,45,false));
		System.out.println("Higher of 23: "+t1.higher(23));//allow to find closet largest element
		System.out.println("Lower of 23: "+t1.lower(23));//allow to find closet lowest element
		System.out.println("Ceiling of 23: "+t1.ceiling(23));
		System.out.println("Floor of 23: "+t1.floor(23));

//celling
//floor

	}	
}