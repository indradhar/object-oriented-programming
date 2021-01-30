package Inheritance;

public class Animals 
{
	public static void main(String[] args)
	{
		//new TestAnimals2().eat();
		new TestAnimals2().bark();//code reusing ,bark is of test class method
	}
}

class TestAnimals
{
	  void bark()
	 {
		System.out.println("Barking...");
	 }
	 
      
}

class TestAnimals2 extends TestAnimals
{
	 void eat()
	{
		System.out.println("eating...");
	}
}

//final,private,static cannot be overridden 
//static method can be overloaded if parameters are varies and we use static keyword infront of method
//even though we can override static method using static in child class we should not use it.
