package interfaces;

public class Example2 
{
	public static void main(String[] args)
	{
		Shape ob1 = new Rectangle(),ob2 = new Circle();
		ob1.draw();
		ob2.draw();
		
	}
}

interface Shape
{
	public abstract void draw();
}
class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing rectangle..");
	}
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing Circle...");
	}
}