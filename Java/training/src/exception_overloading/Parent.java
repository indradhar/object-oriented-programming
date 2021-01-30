package exception_overloading;
//import java.util.*;
class  Parent1
{
	public void disp()//here no Exception is There
	{
		System.out.println("Hello");
	}
	
}
class Child extends Parent1
{
	public void disp()throws ArithmeticException//overridden method can only declare unchecked exception or nothing
	{
		throw new ArithmeticException("Hey Whatsup");
	}
}
public class Parent
{
	public static void main(String[] args)
	{
		Parent1 obj = new Child();
		try
		{
			obj.disp();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Hey once again"+" "+ex.getMessage());
		}
	}
}