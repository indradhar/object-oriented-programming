package StaticKeyWord;

public class Tracker 
{
	public static void main(String[] args)
	{
		TestTracker ob1 = new TestTracker();
		TestTracker ob2 = new TestTracker();
		TestTracker ob3 = new TestTracker();
		
		TestTracker.track();//since it is static the value got updated when the object was created
	}
}

class TestTracker
{
	static int count=0;
	TestTracker()
	{
		count++;
	}
	
	static void track()
	{
		System.out.println(count);
	}
}