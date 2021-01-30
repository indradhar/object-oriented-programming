package arrays;
import java.util.Scanner;
public class Array
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in); 
		TestArray obj = new TestArray();
		System.out.println("Enter the size of the array");
		int size = Sc.nextInt();
		obj.arr=new int[size];
		Integer n =Integer.valueOf(size);
        System.out.println("Enter "+size+" values");
			for(int i=0;i<size;i++)
			{
				obj.arr[i]=Sc.nextInt();
			}
		Sc.close();
	    obj.disp(n);
	    System.out.println();
		obj.sort(n);
		System.out.println();
		obj.disp(n);
	}
}

class TestArray
{
	int arr[];	
	
	void disp(Integer n)
	{
		for(int i=0;i<n;i++)
		{
		  System.out.println(arr[i]);
		}
	}
	
	void sort(Integer n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				int temp;
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
