package multi_threading;

class Test3 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e+"Excep occured "+e.getMessage());
			}
		}
	}
}
public class Multi3 
{
	public static void main(String args[])
	{
		Thread m1 = new Test3();
		Test3 m2 = new Test3();
		m1.start();  m2.start();
		
	}
}
