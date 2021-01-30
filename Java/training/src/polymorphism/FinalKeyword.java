package polymorphism;

public class FinalKeyword 
{
	public static void main(String[] args)
	{
		new Display(3000);
	}
}
/*1.final variable cannot be changed its value 
  2.final method cannot be overridden same as static
  3. final class cannot be extended */
// initializing a blank final variable using constructor or static block

class Light
{
	 final int speed;
	Light(int speed)
	{
		this.speed=speed;
		
	}
	
}
class Display extends Light//class can be extended 
{
	Display(int speed)
	{
		super(speed);
		System.out.println(speed);
	}
}