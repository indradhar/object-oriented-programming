package Constructors;

public class ParameterizedConstructor 
{
	public static void main(String[] args)
	{
		TestConstructor1 ob1 = new TestConstructor1(1800315,"Agent 1");
		TestConstructor1 ob2 = new TestConstructor1(1800314,"Agent 2");
		
		ob1.display();
		ob2.display();
	}
}
class TestConstructor1
{
	int id;
	String name;
	
	TestConstructor1(int id,String name)//constructor in the class assigns the value
	{									//if there is no constructor then java will use default constructor
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(this.id+" "+this.name);
	}
}