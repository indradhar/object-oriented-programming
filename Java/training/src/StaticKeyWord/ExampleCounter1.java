package StaticKeyWord;

public class ExampleCounter1 
{
	public static void main(String[] args)
	{
		TestCounter ob1 = new TestCounter();
		TestCounter ob2 = new TestCounter();
		TestCounter ob3 = new TestCounter();
		ob3.Track();//since it is not static the value gets refreshed when an object is created
		ob1=null;
		ob2=null;
		
	}
}

class TestCounter
{
	int count=0;//use static inorder to update the value
	TestCounter()
	{
		count++;
	}
	
	void Track()
	{
		System.out.println(count);
	}
}