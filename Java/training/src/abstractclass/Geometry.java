package abstractclass;

public class Geometry 
{
	public static void main(String[] args)
	{
		Shape ob1 = new Rectangle(),ob2 = new Circle();
		ob1.draw();
		ob2.draw();
	}
}
abstract class Shape
{
	abstract void draw(); 
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle..");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle...");
	}
}