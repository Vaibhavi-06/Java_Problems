import java.util.*;

class TestList
{
	public static void main(String args[])
	{
		ArrayList l1=new ArrayList();
		l1.add(101);
		l1.add("Ram");
		l1.add("Male");
		l1.add("Pune");
		l1.add(99.99);
		l1.add("Pune");// adding element at last

		l1.add(1,"Shyam");//l1.add(int index,element)
		l1.add(0,1000);// add element at specific position

		ArrayList l2=new ArrayList();
		l2.add("Krishna");
		l2.add("Dwarka");
		l2.add(2000);

		l1.addAll(l2);//adding data from another collection
		
		System.out.println(l1);

		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		l1.set(3,"Rambhau");//replace element at specific
		System.out.println(l1);
	}

}