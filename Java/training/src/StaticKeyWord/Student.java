package StaticKeyWord;

public class Student 
{
	public static void main(String[] args)
	{
		TestStudent ob1 = new TestStudent(1800315,"Agent 1");
		TestStudent ob2 = new TestStudent(1800314,"Agent 2");
		TestStudent.changeSchool();//we can easily access to "change school"so that is is reason "main" is static
		ob1.display();
		ob2.display();
	}
}

class TestStudent
{
	int id;
	String name;
	static String school="DPS";//since school name is common for everyone we can use static 
	
	TestStudent(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	static void changeSchool()//static variables can be accessed by only static methods
	{
		school="WPS";
	}
	void display()
	{
		System.out.println(id+" "+name+" "+school);
	}
}