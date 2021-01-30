package Employee;

public class TestEmployee 
{
	public static void main(String[] args)
	{
		Employee ob1 = new Employee();
		Employee ob2 = new Employee();
		Employee ob3 = new Employee();
		
		ob1.assignDetails(1200, "Agent 1",4500);
		ob2.assignDetails(1201,"Agent 2",4501);
		ob3.assignDetails(1202, "Agent 3", 4502);
		
		ob1.displayDetails();
		ob2.displayDetails();
		ob3.displayDetails();
	}

}

class Employee
{
	int id;
	String name;
	int salary;
	
	void assignDetails(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void displayDetails()
	{
		System.out.println(id+" "+name+" "+salary);
	}
}