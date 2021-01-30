package multi_threading;

class Test9 extends Thread
{
	public void run()
	{
		/*try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException ex)
		{
			System.out.println(" ");
		}*/
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class Multi8 
{
	public static void main(String[] args)
	{
		Test9 P1 = new Test9();
		Test9 P2 = new Test9();
		
		P1.setName("Jc1");
		P2.setName("Jc2");
		
		P1.setPriority(Thread.MIN_PRIORITY);
		P2.setPriority(Thread.MAX_PRIORITY);
		
		P1.start();
		P2.start();
	}
}
