package polymorphism;

public class TypePromotion 
{
	public static void main(String[] args)
	{
		new TestPromotion().sum(10, 20);//so int as parameters will be invoked
	}
}
class TestPromotion
{
	void sum(int a,int b)//overloading in java is not only dependent on return type of method
	{
		System.out.println("Int with parameters is invoked");
	}
	
	void sum(double a,double b)
	{
		System.out.println("Double with parameters is invoked");
	}
}
/*similarly if in the same class
class TestPromotion
{
	void sum(int a,double b)//overloading in java is not only dependent on return type of method
	{
		System.out.println("Int with parameters is invoked");
	}

	void sum(double a,int b)
	{
		System.out.println("Double with parameters is invoked");
	}
}
*/
//then there will be ambiguity error