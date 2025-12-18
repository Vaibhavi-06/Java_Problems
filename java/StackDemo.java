//STACK- it is a DS in which insertion and deletion is possible from only one end
//peek()-it will represent current top element of the stack
//search(object)-search particular object and return its index

import java.util.*;

class StackDemo
{
	public static void main(String args[])
	{
		Stack<Integer> st=new Stack<Integer>();
		Boolean res=st.empty();

		System.out.println("Is stack empty? "+res);

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);

		System.out.println("Elements of stack: "+st);

		System.out.println("Top of stack: "+st.peek());

		st.pop();
		st.pop();
		st.pop();


		System.out.println("Elements of stack after pop: "+st);

		System.out.println("Top of stack: "+st.peek());

		System.out.println("Index of 20: "+st.search(20));

		System.out.println("Index of 50: "+st.search(50));




	}
}