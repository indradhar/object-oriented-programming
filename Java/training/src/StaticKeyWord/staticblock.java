package StaticKeyWord;

public class staticblock 
{
	public static void main(String[] args)
	{
		TestStaticBlock obj = new TestStaticBlock();
		obj.display();
	}
}
class TestStaticBlock
{
	static
	{
		System.out.println("Static block is invoked");//static block is invoked before main method
	}
	
	void display()
	{
		System.out.println("hi");
	}
}