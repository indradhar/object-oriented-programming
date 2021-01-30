package polymorphism;

public class SuperKeyword2
{
	public static void main(String[] args)
	{
		new Cat().display();
	}
}

class Dog
{
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Cat extends Dog
{
	void eat()
	{
		System.out.println("Eating bread...");
	}
	
	void sleep()
	{
		System.out.println("Sleeping...");
	}
	
	void display()
	{
		sleep();
		super.eat();
		eat();
	}
}