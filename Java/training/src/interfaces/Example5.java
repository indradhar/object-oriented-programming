package interfaces;

public class Example5 
{
	public static void main(String[] args)
	{
		Testclass obj = new Testclass();
		obj.print();
	}
	
}
interface Printable2
{
	public abstract void print();
}
interface Showable2
{
	public abstract void print();
}
class Testclass implements Printable2,Showable2
{
	public void print()
	{
		System.out.println("Hello");
	}
}
