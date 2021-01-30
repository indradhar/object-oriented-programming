package polymorphism;

public class SuperKeyword4 
{
	public static void main(String[] args)
	{
		new Emp(1800315,"Agent 1",25000f).display();
	}
	
}

class  Person
{
	String name;
	int id;
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class Emp extends Person
{
	float salary;
	Emp(int id,String name,float salary)
	{
		super(id,name);// so we have to use super explicitly in order to pass id and name 
		/*this.id=id;
		this.name=name;
		this.salary=salary;*/
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
}