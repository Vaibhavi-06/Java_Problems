/*MAP- collection of enties(Map Interface)
where wach entry<key,value> (Map.entry Interface)
key:unique value associated with each entry
hashmap,linkedhashmap,treemap<SortedMap>*/


import java.util.*;

class MapDemo
{
	public static void main(String args[])
	{
		HashMap m1=new HashMap();
		
		m1.put(1,"vaishnavi");
		m1.put(2,"Shital");
		m1.put(3,"Vaibhavi");
		m1.put(4,"Dhanashri");
		m1.put(5,"Akshada");

		System.out.println(m1);

		Set s=m1.entrySet();

		Iterator itr=s.iterator();

		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		m1.remove(4);
		System.out.println(m1);

		System.out.println(m1.keySet());
		
		System.out.println("Key 3 is exists?: "+m1.containsKey(3));
		System.out.println("Vaibhavi is exists?: "+m1.containsValue("Vaibhavi"));
		System.out.println("Get(3)?: "+m1.get(3));
		m1.replace(5,"Shivani");
		
		System.out.println(m1);

		LinkedHashMap m2=new LinkedHashMap();
		
		m2.put(1,"vaishnavi");
		m2.put(2,"Shital");
		m2.put(3,"Vaibhavi");
		m2.put(4,"Dhanashri");
		m2.put(5,"Akshada");

		System.out.println(m2);

		Set s1=m2.entrySet();

		Iterator itr1=s1.iterator();

		while(itr1.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr1.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		TreeMap t1=new TreeMap();
		
		t1.put(1,"vaishnavi");
		t1.put(2,"Shital");
		t1.put(3,"Vaibhavi");
		t1.put(4,"Dhanashri");
		t1.put(5,"Shital");

		System.out.println(t1);

		Set s2=t1.entrySet();

		Iterator itr2=s2.iterator();

		while(itr2.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr2.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}


	}
	
}

Explore Methods of all collection and map classes
HashSet() d/b HashMap()
EnumeratedMap()