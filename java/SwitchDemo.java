class SwitchDemo
{
	public static void main(String args[])
	{
		int ch;
		System.out.println("1. Cricket");
		System.out.println("2. Football");
		System.out.println("3. Rugby");
		System.out.println("4. Polo");
		System.out.println("5. Kabaddi");

		//Enter your choice
		ch=3;

		switch(ch)
		{
			case 1:
			System.out.println("My favourite sport is Cricket");
			break;
			
			case 2:
			System.out.println("My favourite sport is Football");
			break;


			case 3:
			System.out.println("My favourite sport is Rugby");
			break;


			case 4:
			System.out.println("My favourite sport is Polo");
			break;


			case 5:
			System.out.println("My favourite sport is Kabaddi");
			break;

			
			default:
			System.out.println("Invalid sport");
			break;


		}
	}
}