class Frequency
{
	public static void main(String args[])
	{
		int arr[]={1,2,2,3,1,3,2};
		int freq[]=new int[7];

		int visited=-1;

		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited)
			freq[i]=count;
		}

		for(int i=0;i<7;i++)
		{
			if(freq[i]!=visited)
			{
				System.out.println("Number: "+arr[i]+" Frequency: "+freq[i]);

			}
		}
	}
}