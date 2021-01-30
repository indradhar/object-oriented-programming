package interfaces;

public class Example1
{
	public static void main(String[] args)
	{
		Printable obj = new Drawable(); //the object is provided by factory method the end user who uses it
		obj.print();                    //here the functionality is hidden 
	}
}

interface Printable  //interface is created by user 1
{
	void print();//by default in interface all the methods are public abstract
				//and all the data members are public static final  JVM automatically adds it
}
 
class Drawable implements Printable //an interface is implemented by another user 2
{
	public void print()
	{
		System.out.println("HEllo");
	}
}