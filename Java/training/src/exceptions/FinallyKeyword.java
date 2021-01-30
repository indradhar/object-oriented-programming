/*three cases possible,
 * 1.exception not occurred
 * 2.exception occurred and not handled
 * 3.exception occurred and handled 
 * in all these cases finally block will get executed and for 1 try block only 1 finally allowed 
 * and 0-n catch blocks allowed
 */
package exceptions;
import java.util.Scanner;
public class FinallyKeyword 
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		TestFinally obj = new TestFinally();
		System.out.println("Enter any two values");
		obj.a = Sc.nextInt();
		obj.b = Sc.nextInt();
		Sc.close();
		try
		{
			int c = obj.a/obj.b;
			Integer C = Integer.valueOf(c);
			obj.disp(C);
		}
		/*this is for case 2
		catch(ArithmeticException e)
		{
			System.out.println("Divisor cannot be zero"+" "+e);
		}*/
		/*this is for case 3 i.e., exception is not handled
		catch(NullPointerException e)
		{
			System.out.println("Divisor cannot be zero"+" "+e);
		}*/
	
		finally
		{
			System.out.println("FInally block is invoked");
		}
		
		System.out.println("Rest of the code");
		
	}
}
class TestFinally
{
	int a;
	int b;
	void disp(int c)
	{
		System.out.println(c);
	}
}