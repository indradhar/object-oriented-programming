
public class Typeconversion
{
	int a=40;
	float b=20.5f;
	int c=20;
	char d;
	public static void main(String[] args)
	{
		Typeconversion obj = new Typeconversion();
		obj.a=20;
		obj.b=obj.a;//widening
		obj.c=(int)obj.b;//narrowing
		obj.d='a';
		System.out.println(obj.b);
		System.out.println(obj.d);
	}
}
