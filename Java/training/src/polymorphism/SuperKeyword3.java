package polymorphism;

public class SuperKeyword3 
{
	public static void main(String[] args)
	{
		new Cat1();
	}
}

class Animal
{
	Animal()
	{
		System.out.println("A Dog.");
	}
}
class Cat1 extends Animal
{
	Cat1()
	{
		super();//whenever there is no super then default constructor will invoke it automatically and creates it
		System.out.println("A Cat.");
	}
}