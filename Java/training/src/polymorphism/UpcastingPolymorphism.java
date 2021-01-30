package polymorphism;

public class UpcastingPolymorphism 
{
	public static void main(String[] args)
	{
		Animal2 obj;
		obj = new TestAnimal();
		obj.display();
	}
}

class Animal2
{
	void display()
	{
		System.out.println("Animal class ");
	}
}
class TestAnimal extends Animal2
{
	void display()
	{
		System.out.println("Test class");
	}
}