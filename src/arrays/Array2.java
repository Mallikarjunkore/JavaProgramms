package arrays;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();

	}
	
	public static void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		//System.out.println("enter the length of the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		print(a);
		
	}
	public static void print(int a[])
	{
		System.out.println("the array elements are");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
