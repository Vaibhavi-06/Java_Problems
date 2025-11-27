class ATM
{
	public static void main(String args[])
	{
		Account a1=new Account();

		System.out.println(a1.viewBalance());
		System.out.println("My current balance is: "+a1.depositeBal(100000));
		System.out.println("Your available balance is: "+a1.WithdrawBal(15000));

	}
}