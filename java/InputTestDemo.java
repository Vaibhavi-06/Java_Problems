//Scanner class 

import java.util.*;

class InputTestDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a message: ");
		String message=sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();

		System.out.println("Enter your salary: ");
		double salary=sc.nextDouble();


		System.out.println("Your message is: "+message);
		System.out.println("Age is: "+age);
		System.out.println("Salary is: "+salary);

		sc.close();
	}
}