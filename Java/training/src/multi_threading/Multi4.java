package multi_threading;

class Printchar implements Runnable
{
	private int times;
	private char char_to_print;
	Printchar(int times,char char_to_print)
	{
		this.times=times;
		this.char_to_print=char_to_print;
	}
	
	public void run()
	{
		for(int i=0;i<times;i++)
		{
			System.out.println(char_to_print);
		}
	}
}
class Printnum implements Runnable
{
	private int last_num;
	Printnum(int last_num)
	{
		this.last_num=last_num;
	}
	public void run()
	{
		for(int i=0;i<last_num;i++)
		{
			System.out.println(i);
		}
	}
}
public class Multi4 
{
	public static void main(String[] args)
	{
		Runnable task1 = new Printnum(100);
		Runnable task2 = new Printchar(50,'a');
		Runnable task3 = new Printnum(10);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		Thread t3 = new Thread(task3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
