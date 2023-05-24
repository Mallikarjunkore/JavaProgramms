package arrays;

import java.util.Scanner;

public class Largestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int n=sc.nextInt();
		int a[]=new int[n],max;
		System.out.println("enter the array elements");
		//System.out.println("enter the length of the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("the largest element is "+max);

	}

}
