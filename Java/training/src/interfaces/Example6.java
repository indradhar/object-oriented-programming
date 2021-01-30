package interfaces;

public class Example6 
{
	public static void main(String[] args)
	{
		Testclass2 obj = new Testclass2();
		obj.Show();
		obj.print();
	}
	

}

interface Printable3
{
	public abstract void print();
}
interface Showable3 extends Printable3
{
	public abstract void Show();
}
class Testclass2 implements Showable3
{
	public void print()
	{
		System.out.println("printing...");
	}
	public void Show()
	{
		System.out.println("showing...");
	}
}

/*interface Drawable{  
void draw();  
static int cube(int x){return x*x*x;}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
  
class TestInterfaceStatic{  
public static void main(String args[]){  
Drawable d=new Rectangle();  
d.draw();  
System.out.println(Drawable.cube(3));  
}}  */

//we can have static methods with body and default methods as well.