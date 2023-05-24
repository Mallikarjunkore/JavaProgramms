package arrays;

import java.util.Scanner;

public class Printarrayinreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("the array elements are");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}

	}

}
