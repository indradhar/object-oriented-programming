package exceptions;
import java.util.*;
public class ExceptionHandling 
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		TestException obj = new TestException();
		System.out.println("Enter any two value");
		try
		{
			obj.a = Sc.nextInt();
			obj.b=Sc.nextInt();
			Integer a = Integer.valueOf(obj.a);
			Integer b = obj.b;
			double c =obj.divide(a , b);
			System.out.println("a/b:"+c);
			Sc.close();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divisor cannot be zero"+" "+e);
		}
		System.out.println("Program continues");
	}
}
class TestException
{
	int a;
	int b;
	
	double divide(int a,int b)
	{
		double c =a/b;
		return c;
	}
}