package Inheritance;

public class Employee 
{
	public static void main(String[] args)
	{
		Programmer obj = new Programmer();
		System.out.println(obj.name+" "+obj.salary+" "+obj.Type);
	}
}

class TestEmployee
{
	String name="Agent 1";
	int salary=25000;
/*	TestEmployee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}*/
}
class Programmer extends TestEmployee
{
	String Type="Programmer";
}