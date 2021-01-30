package BankAccount;

public class TestAccount
{
	public static void main(String[] args)
	{
		Account obj = new Account();
		obj.insert(638215544, "Agent 1", 15000);
		obj.display();
		obj.withdraw(15001);
		obj.deposit(1000);
		obj.withdraw(15000);
		obj.checkBalance();
	}
}

class Account
{
	int acc_no;
	String name;
	int amount;
	
	void insert(int acc_no,String name,int amount)
	{
		this.acc_no = acc_no;
		this.name = name;
		this.amount = amount;
	}
	
	void display()
	{
		System.out.println(acc_no+" "+name+" "+amount);
	}
	
	void checkBalance()
	{
		System.out.println("Balance is:"+amount);
	}
	
	void deposit(int amount)
	{
		this.amount += amount;
		System.out.println("diposited amount:"+amount+" Updated Balance is:"+this.amount);
	}
	
	void withdraw(int amount)
	{
		if(this.amount<amount)
		{
			System.out.println("insufficient Funds");
		}
		else
		{
			this.amount -= amount;
			System.out.println("Withdrawn amount is:"+amount+" Remaining balance is:"+this.amount);
		}
	}
	
}