/*VECTOR- same  like as arraylist,it also called as dynamic array
vector is synchronized also vector is legacy class 
it support lot of legacy methods that arraylist does ot support*/

//capacity(),clone(),size(),indexOf(),remove(),add(),set(),get(),isEmpty(),subList(),toArray()


import java.util.*;

class VectorDemo
{
	public static void main(String args[])
	{
		Vector<String> v1=new Vector<String>();
	
		v1.add("Tiago");
		v1.add("Tigor");
		v1.add("Altroz");
		v1.add("Harrier");
		v1.add("Punch");
		v1.add("Curve");
		v1.add("Safari");

		v1.addElement("Sierra");//addElement()-it will append element into your vector

		System.out.println(v1);

		System.out.println(v1.firstElement());//retrive fist element into vector

		System.out.println(v1.lastElement());//retrive last element into vector
			
		System.out.println(v1.elements());

		System.out.println(v1.elementAt(4));

		System.out.println(v1.removeElements());//remove last element

		System.out.println(v1.removeElementAt(4));//remove element at specific index


	} 
}