package ObjectCreation;

public class AnonymousObject 
{
	public static void main(String[] args)
	{
		new Factorial().calculateFact(5);//anonymous object can only used once
	}
}
class Factorial
{
	void calculateFact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	
		System.out.println(fact);
	}
}