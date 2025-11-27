class Multielement
{
	public static void main(String args[])
	{
		//int a=10,20,30,40,50;
		
		//int a[]={10,20,30,40,50};

		int a[]=new int[5];

		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		System.out.println("Output using  normal for loop");

		for(int i=0;i<a.length;i++) //length is property of array
		{
		System.out.println(a[i]);
		}

		System.out.println("Output using for-each loop");

		for(int j:a)
		{
			System.out.println(j);
		}
		

	}
}

//System.out.println(a[1]);
//System.out.println(a[2]);
//System.out.println(a[3]);
//System.out.println(a[4]);
