package multi_threading;

class Test7 extends Thread implements Runnable
{
	public void run()
	{
		/*try
		{
			Thread.sleep(500);
		}
		catch (InterruptedException ex)
		{
			System.out.println("LOL");
		}*/
		System.out.println("HEllo");
	}
}
public class Multi6 
{
	public static void main(String[] args)
	{
		Runnable P1 = new Test7();
		Test7 P2 = new Test7();
		Thread T1 = new Thread(P1);
		Thread T2 = new Thread(P2);
		System.out.println("T1 name is:"+T1.getName());
		System.out.println("T2 name is:"+T2.getName());
		System.out.println("T1 id :"+T1.getId());
		
		T1.start();
		T2.start();
		T2.setName("JCruxx");
		System.out.println("T2 name is:"+T2.getName());
	}

}
