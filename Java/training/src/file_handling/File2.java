package file_handling;
import java.io.FileOutputStream;
public class File2 
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout = new FileOutputStream("F:\\Test1.txt");
			String S = "Hello Welcome to File Handling";
			byte b[] = S.getBytes();
			fout.write(b);
			fout.close();
		}
		catch(Exception ex)
		{
			System.out.println("Sorry!");
		}
		System.out.println("Success");
	}
}
