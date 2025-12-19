import java.util.*;

class TreeTest1
{
	public static void main(String args[])
	{	
		NavigableSet<Integer> t2=new TreeSet<Integer>();

		t2.add(5);
		t2.add(20);
		t2.add(30);
		t2.add(40);
		t2.add(50);
		

		System.out.println("TreeSet: "+t2);
		
		System.out.println("Higher of 3: "+t2.higher(3));
		System.out.println("Ceiling of 51: "+t2.ceiling(51));//ceiling

		System.out.println("Floor of 3: "+t2.floor(3));//floor
		System.out.println("Lower of 5: "+t2.lower(5));
	}
}