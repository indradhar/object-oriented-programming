package multi_threading;

class test1 extends Thread
{
	public void run()
	{
		System.out.println("Hello");
	}
}
public class Multi1 
{
	public static void main(String[] args)
	{
		Thread t1 = new test1();
		t1.start();
	}
}