import java.util.*;

class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList l1=new ArrayList();
		
		l1.add(10);
		l1.add(34);
		l1.add(67);
		l1.add(20); 

		System.out.println("Original List: "+l1);
		
		Collections.sort(l1);//sort()-arrange in ascending order

		System.out.println("Sorted List: "+l1);

		System.out.println("Element at l1.get(1):"+l1.get(1));//get()-fint the element of specific index

		ArrayList l2=new ArrayList();
		
		l2.add("Vaibhavi");
		l2.add("Vaishnavi");
		l2.add("Akshada");
		l2.add("Rutika"); 

		System.out.println("Original List: "+l2);
		
		Collections.sort(l2);

		System.out.println("Sorted List: "+l2);

		l2.remove("Rutika");

		System.out.println(l2);

		l1.addAll(l2);

		System.out.println("After Add All: "+l1);
		
		l1.removeAll(l2);

		System.out.println("After Remove All l2 elements: "+l1);


		ArrayList l3=new ArrayList();
		
		l3.add(10);
		l3.add(56);
		l3.add(72);
		l3.add(77); 

		System.out.println("L3: "+l3);

		System.out.println("Index of 72 in L3: "+l3.indexOf(72));

		System.out.println("78 is avialble in L3: "+l3.contains(78));

		System.out.println("72 is avialble in L3: "+l3.contains(72));

		l3.clear();

		System.out.println("L3:"+l3);
		
	}
}

//get()-it allow to retrive elements from arraylist
//syntax-
//ArrayListObject.get(int index)

//sort()-which will allow us to sort our collection(0-9/A-Z)

//remove()-allows to remove elements from arraylist

//removeAll()-it will remove all the new elements from collections

//it only accecpt collection object

//indexOf(element)-it will return integer index of that element from your collection-l1.indexOf()

//contains()- it verify/check whether element is part of your collection or not-l1.contains()

//clear()-remove/delete all element of your collection-l1.clear()