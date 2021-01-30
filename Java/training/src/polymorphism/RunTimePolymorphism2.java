package polymorphism;

public class RunTimePolymorphism2
{
	public static void main(String[] args)
	{
		Bike obj = new Pulsor();
		System.out.println(obj.speed);//25
	}
}
//run time polymorphism cannot achieved with data types
class Bike
{
	int speed=25;
}
class Pulsor extends Bike
{
	int speed = 50;
}