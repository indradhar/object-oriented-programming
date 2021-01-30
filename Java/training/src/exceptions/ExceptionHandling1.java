package exceptions;
import java.util.Scanner;
public class ExceptionHandling1 
{
	public static void main(String[] args)
	{
		TestException1 obj = new TestException1();
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter any the size of the array");
		int size = Sc.nextInt();
		obj.arr=new int[size];
		System.out.println("Enter any two value");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		Sc.close();
		try
		{
		  obj.arr[5]=a/b;//expected an exception index out of bounds or arithmetic or both
		  obj.disp();
		}
		catch(ArithmeticException e)//even though there are two exceptions only 1 catch will be executed
		{
			System.out.println("Divisor cannot be zero"+" "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index overflow"+" "+e);
		}
		catch(Exception e)//catch blocks should be in preference order
		{
			System.out.println("There is an exception apart from these both");
		}
		System.out.println("Rest of the code");
	} 
}
class TestException1
{
	int arr[];
	
	void disp()
	{
		System.out.println(arr[5]);
	}
}
