package AreaCalculator;

public class TestAreaRectangle
{
	public static void main(String[] args) 
	{
		AreaRectangle ob1 = new AreaRectangle();
		AreaRectangle ob2 = new AreaRectangle();
		
		ob1.assignDetails(25,20);
		ob2.assignDetails(23, 22);
		
		ob1.displayDetails();
		ob2.displayDetails();
	}
}

class AreaRectangle
{
	int length;
	int breadth;
	
	void assignDetails(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void displayDetails()
	{
		System.out.println("Area is:"+(length*breadth));
	}
}