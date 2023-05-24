package arrays;

import java.util.Scanner;

public class Even {

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
			for(int i=0; i<a.length; i++)
			{
				if(a[i]%2==0)
				{
					System.out.println(a[i]+" is even");
				}
				else
				{
					System.out.println(a[i]+" is odd");
				}
			}

	}

}
