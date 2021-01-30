package polymorphism;

public class SuperKeyword 
{
	public static void main(String[] args)
	{
		new Test1().printcolor();
	}
}
/* we all know that super keyword is used to invoke the 
 immediate parent class constructor or method or instance variable*/

/* but we should also observe that the default constructor in java also adds 
   super method in the child class for immediate constructor if we do not mention any*/

class SuperForVariable
{
	String name="Agent 1";
	
}
class Test1 extends SuperForVariable
{
	String name="Agent 2";
	
	void printcolor()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
}