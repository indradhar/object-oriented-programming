package Constructors;

public class ConstructorOverloading 
{
	public static void main(String[] args)
	{
		TestConstructor2 ob1 = new TestConstructor2(1800315,"Agent 1");
		TestConstructor2 ob2 = new TestConstructor2(1800314,"Agent 2",50000);
		ob1.display();
		ob2.display();
		
	}
}

class TestConstructor2
{
	int id;
	String name;
	int salary;
	
	TestConstructor2(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	TestConstructor2(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display() 
	{
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}
}