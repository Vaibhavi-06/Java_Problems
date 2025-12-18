import java.util.*;

class SetDemo
{
	public static void main(String args[])
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(20);
		hs.add(14);
		hs.add(56);
		hs.add(87);
		hs.add(10);
		hs.add(null);

		System.out.println("HashSet: "+hs);

		System.out.println("Clone HashSet: "+hs.clone());
		hs.remove(20);
		System.out.println("Remove HashSet: "+hs);
		System.out.println("Size of HashSet: "+hs.size());
		System.out.println("Is Empty: " + hs.isEmpty());
		System.out.println("Contains of 56: "+hs.contains(56));
		hs.clear();
		System.out.println("Clear of HashSet: "+hs);

		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		
		lhs.add(20);
		lhs.add(14);
		lhs.add(56);
		lhs.add(87);
		lhs.add(10);
		lhs.add(null);

		System.out.println("LinkedHashSet: "+lhs);

		System.out.println("Clone LinkedHashSet: "+lhs.clone());
		lhs.remove(56);
		System.out.println("After Remove LinedHashSet: "+lhs);
		System.out.println("Size of LinedHashSet: "+lhs.size());
		System.out.println("Is Empty: " + lhs.isEmpty());
		System.out.println("Contains of 56: "+lhs.contains(56));
		lhs.clear();
		System.out.println("After Clear LinedHashSet: "+lhs);

		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(20);
		ts.add(14);
		ts.add(56);
		ts.add(87);
		ts.add(10);
		//ts.add(null);//not allow null value

		System.out.println("TreeSet: "+ts);

		System.out.println("Clone TreeSet: "+ts.clone());
		ts.remove(87);
		System.out.println("After Remove TreeSet: "+ts);
		System.out.println("Size of TreeSet: "+ts.size());
		System.out.println("Is Empty: " + ts.isEmpty());
		System.out.println("Contains of 56: "+ts.contains(56));
		ts.clear();
		System.out.println("After Clear TreeSet: "+ts);


	}
}