package interfaces;

public class Example4
{
	public static void main(String[] args)
	{
		Test obj = new Test();
		obj.show();
		obj.print();
	}

}

interface Printable1
{
	public abstract void print();
}

interface Showable
{
	public abstract void show();
}

class Test implements Printable1,Showable
{
	public void print()
	{
		System.out.println("Printable");
	}
	
	public void show()
	{
		System.out.println("Showing");
	}
}