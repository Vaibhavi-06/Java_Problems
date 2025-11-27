public class Account{

	private float balance;
	
	public float getviewBalance()
	{
		return balance;
	}


	public float depositeBal(float amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
		}
		return balance;
	}ss
	
	public float withdrawBal(float amount)
	{
		if(balance>amount && amount>0)
		{
			balance=balance+amount;
		}
		return balance;

	}
	
}