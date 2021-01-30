package StaticKeyWord;

public class Cube 
{
	public static void main(String[] args)
	{
		int x=TestCube.cube(5);
		System.out.println("The value of cube is:"+x);
	}
}
class TestCube
{
	static int cube(int i)
	{
		return(i*i*i);
	}
}