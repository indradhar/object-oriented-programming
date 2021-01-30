package exception_overloading;
import java.io.IOException;
public class Father 
{
	public static void main(String[] args)
	{
		TestFather obj = new Children();
		try
		{
			obj.display();
		}
		catch(IOException Ex)
		{
			System.out.println("OOPS"+" "+Ex.getMessage());
		}
	}
}
class TestFather 
{
	void display()throws IOException//super method is defined IO Exception
	{
		System.out.println("Hey There!");
	}
}
class Children extends TestFather
{
	void display()throws IOException//overridden method should also use the same or nothing
	{
		throw new IOException("Hey");
	}
}