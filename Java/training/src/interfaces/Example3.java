package interfaces;

public class Example3 
{
	public static void main(String[] args) 
	{
		Bank ob1 = new SBI(),ob2 = new ICICI();
		System.out.println(ob1.getRateOfInterest()+" "+ob2.getRateOfInterest());
		
	}
}
interface Bank
{
	float getRateOfInterest();
}

class SBI implements Bank
{
	public float getRateOfInterest()
	{
		return(8.25f);
	}
}
class ICICI implements Bank
{
	public float getRateOfInterest()
	{
		return(7.25f);
	}
}