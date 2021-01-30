package polymorphism;

public class RunTimePolymorphim 
{
	public static void main(String[] args)
	{
		Bank ob1 = new ICICI(),ob2 = new SBI(),ob3 = new AXIS();
		
		System.out.println(ob1.getRateOfInterest()+" "+ob2.getRateOfInterest()+" "+ob3.getRateOfInterest());
	}
}

class Bank
{
	float getRateOfInterest()
	{
		return(8.55f);
	}
}
class ICICI extends Bank
{
	float getRateOfInterest()
	{		
		return(8.22f);
	}
}
class SBI extends Bank
{
	float getRateOfInterest()
	{
		return(6.22f);
	}
}
class AXIS extends Bank
{
	float getRateOfInterest()
	{
		return(9.22f);
	}
}