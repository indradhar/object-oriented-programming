package fibonacci;

public class RecursiveFibonacci 
{
	static int a=0,b=1,c=0,n=10;
	public static void main(String[] args)
	{
		
		System.out.print(a+" "+b);
		fibonacci(n-2);
		
	}
	
	static void fibonacci(int count)
	{
		if(count>0)
		{
			c = a+b;
			System.out.print(" "+c+" ");
			a=b;
			b=c;
			fibonacci(count-1);
		}
	}
	
}
