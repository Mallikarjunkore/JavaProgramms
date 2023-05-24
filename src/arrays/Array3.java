package arrays;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=read();
		print(a);
		

	}
	public static int[] read()
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
		return a;
		
		
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
