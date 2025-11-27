class NumberReverse{
	public static void main(String args[])
	{
		int no=3456;
		int revNum=0;

		do
		{
			int digit=no%10;
			revNum=revNum*10+digit;
			no/=10;
		}while(no!=0);

		System.out.println(revNum);
	}
}