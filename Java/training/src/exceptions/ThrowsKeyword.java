package exceptions;

import java.io.IOException;
public class ThrowsKeyword 
{
	public static void main(String[] args)
	{
		TestThrows obj = new TestThrows();
		try
		{
			obj.method1();
		}
		catch(Exception ex)
		{
			System.out.println("Try Again"+" "+ex.getMessage());
		}
	}
}
class TestThrows
{
	void method1()throws IOException
	{
		method2();
	}
	void method2()throws IOException
	{
		method3();
	}
	int method3()throws IOException
	{
		throw new IOException("Cannot be This type of Input");
		//return(1/0);
		/*In case of arithmetic exception(i.e., Unchecked Exception) it propagates to its super class 
		 * but in case of Checked Exception like IO we have to take care of it by using throws keyword to tell that will throws an exception
		 */
	}
}