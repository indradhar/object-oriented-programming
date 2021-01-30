package Constructors;

public class CopyConstructor 
{
	public static void main(String[] args)
	{
		TestConstructor3 ob1 = new TestConstructor3(1800315,"Agent 1");
		TestConstructor3 ob2 = new TestConstructor3(ob1);
		
		ob1.display();
		ob2.display();
	}
}

class TestConstructor3
{
	int id;
	String name;
	
	TestConstructor3(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	TestConstructor3(TestConstructor3 ob1)//copying values with the help of constructors
	{
		this.id=ob1.id;
		this.name=ob1.name;
	}
	
	void display()
	{
		System.out.println(this.id+" "+this.name);
	}
}