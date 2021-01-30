package Constructors;

public class CopyConstructor2 
{
	public static void main(String[] args)
	{
		TestConstructor4 ob1 = new TestConstructor4(1800315,"Agent 1");
		TestConstructor4 ob2 = new TestConstructor4();
		ob2.id=ob1.id;
		ob2.name=ob1.name;
		
		ob1.display();
		ob2.display();
	}

}
class TestConstructor4
{
	int id;
	String name;
	
	TestConstructor4(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	TestConstructor4()//here if you don't give any constructor then it won't create any default constructor
	{					//because there is already constructor with parameters
		
	}
	
	void display()
	{
		System.out.println(this.id+" "+this.name);
	}
}