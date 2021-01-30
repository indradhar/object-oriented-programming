package multi_threading;


public class Multi2 implements Runnable
{
	public static void main(String[] args)
	{
		
	new Multi2();
	}
	public Multi2()
	{
		
		new Thread(this).start();
	    
	}
	public void run()
	{
		System.out.println("Hey!");
	}
	
}
