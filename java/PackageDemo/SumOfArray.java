class SumOfArray
{
	public static void main(String args[])
	{
		int a[]=new int[10];
	
		int sum=0;

		for(int i=1;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}	
	
		System.out.println("Sum of first 10 natural numbers: ");

		for(int j:a)
		{
			sum = sum + j;
		}
		
		System.out.println(sum);

	}
}

