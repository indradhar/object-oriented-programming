package exceptions;
import java.util.*;
public class Exception1
{
		public static void main(String[] args)
		{
			int flag=0;

			TestException2 obj = new TestException2();
			
			do 
			{
				try
				{
					obj.input();
					double c = obj.divide();//Exception
					flag=1;
					System.out.println("The quotient is:"+" "+c);
				}
				catch(ArithmeticException ex)
				{
					System.out.println("Kindly enter the values again since Exception occureed"+" "+ex.getMessage());
					
				}
				catch(InputMismatchException ex)
				{
					System.out.println("Kindly enter the values again since Exception occureed"+" "+ex.getMessage());
				}
			
			}
			while(flag==0);
		}
}
class TestException2
{
	double a;
	double b;
	
	void input()
	{
		System.out.println("Enter any two integer values");
		Scanner Sc = new Scanner(System.in);
		a=Sc.nextInt();
		b=Sc.nextInt();
		if(this.b !=0)
			Sc.close();
	}
	double divide()
	{
		if(this.b==0)
			throw new ArithmeticException("Divisor cannot be zero");
		return(this.a/this.b);
	}
	
	
}