package file_handling;
import java.io.FileOutputStream;
public class File1 
{
	public static void main(String[] args)
	{
		try
		{
		FileOutputStream fout = new FileOutputStream("F:\\testout.txt");
		fout.write(65);
		fout.close();
		System.out.println("Success");
		}
		catch(Exception ex)
		{
			System.out.println("Sorry");
		}
		
	}

}
