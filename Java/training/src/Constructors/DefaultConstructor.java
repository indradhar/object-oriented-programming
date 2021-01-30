package Constructors;

public class DefaultConstructor 
{
	public static void main(String[] args) 
	{
		new TestConstructor().display();//anonymous object
		new TestConstructor().display();//Since there is no constructor in the test class 
										//java assigns the values to "0" and "null"
	}

}

class TestConstructor
{
	int id;
	String name;
	
	void display()
	{
		System.out.println(id+" "+name);
	}
}
