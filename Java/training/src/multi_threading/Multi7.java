package multi_threading;

class Test8 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException ex)
		{
			System.out.println(" ");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
public class Multi7 
{
	public static void main(String[] args)
	{
		Test8 P1 = new Test8();
		Test8 P2 = new Test8();
		P1.setName("JC1");
		P2.setName("JC2");
		P1.start();
		P2.start();
	}
}
