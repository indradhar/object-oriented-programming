package polymorphism;

public class overloadingMainMethod
{
	public static void main(String[] args)
	{
		System.out.println("String[] args invoked");//since we can overload main method but java invokes only array of string with args
	}												//we cannot overload static method since it is bound with static class
													//we can overload non static methods because it is bound with heap memory
	public static void main(String args)
	{
		System.out.println("String args invoked");
	}
	
	public static void main()
	{
		System.out.println("Main with no args invoked");
	}
}
