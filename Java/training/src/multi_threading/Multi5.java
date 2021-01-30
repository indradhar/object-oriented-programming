package multi_threading;

class Test6 extends Thread
{
	int n;
	Test6(int size)
	{
		this.n=size;
	}
	public void run()
	{
		for(int i=0;i<n;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(" "+e+" "+e.getMessage());
			}
			System.out.println(i);
		}
	}
}
public class Multi5 
{
	public static void main(String[] args)
	{
		Test6 P1 = new Test6(10);
		P1.start();
		try
		{
			P1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("huh"+" "+e.getMessage());
		}
		Test6 P2 = new Test6(10);
		Test6 P3 = new Test6(10);
		
		P2.start();
		P3.start();
	}

}
