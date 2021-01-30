package abstractclass;

public class TestAbstraction2 
{
	public static void main(String[] args)
	{   //we cannot instantiate the abstract class
		Bike obj = new Hero();//bike will invoke due to super created by compiler
		obj.changeGear();//overridden method will get invoked
		obj.run();//implemented run will invoked
	}
}
abstract class Bike
{
	Bike()
	{
		System.out.println("Bike is invoked");
	}
	abstract void run();
	void changeGear()
	{
		System.out.println("Gear changed");
	}
}

class Hero extends Bike
{
	void changeGear()
	{
		System.out.println("SPeed is 60");
	}
	void run()
	{
		System.out.println("Bike is running...");
	}
}