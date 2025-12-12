import java.util.*;

class ScannerHasNextDemo
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner("Hello Vaibhavi Fulsundar");

		//while(sc.hasNext()){
			//System.out.println(sc.next());

		//Scanner sc=new Scanner("Hello Vaibhavi Fulsundar\n You are a Student\n You learn Full Stack Java");

		//while(sc.hasNextLine()){
			//System.out.println(sc.nextLine());

		//Scanner sc=new Scanner("My age is 21 years");

		//while(sc.hasNext()){

			//if(sc.hasNextInt())
				//System.out.println(sc.next());
			//else
				//sc.next();

		//}
		Scanner sc=new Scanner("My age is 21 years");

			boolean hasNextToken=sc.hasNext();
			System.out.println("Does my string contains next token?: "+hasNextToken);
	
	}		
}
//explore method of scanner class with example