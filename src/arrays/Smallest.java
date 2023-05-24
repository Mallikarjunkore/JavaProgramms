package arrays;
import java.util.Scanner;
public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n],small;
		System.out.println("enter the elements of array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		small=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("smallest element is "+small);

	}

}
