class DifferentBufferBuilder
{
	public static void main(String args[])
	{
		long startTime=System.currentTimeMillis();

		StringBuffer sb=new StringBuffer("Java");

		for(int i=0;i<50000;i++)
		{
			sb.append("is easy");
		}
		System.out.println("Time taken by StringBuffer: "+(System.currentTimeMillis()-startTime));

		
		startTime=System.currentTimeMillis();

		StringBuilder sb1=new StringBuilder("Java");

		for(int i=0;i<50000;i++)
		{
			sb.append("is easy");
		}
		System.out.println("Time taken by StringBuilder: "+(System.currentTimeMillis()-startTime));

	}
}






//string buffer - thread safe,syncronized,slower

//string builder - non-thread safe,unsyncronized,faster