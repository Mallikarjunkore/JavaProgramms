package practice;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		char a[]=new char[n];
		System.out.println("enter the elements in the array");
		for (int i=0; i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		
		System.out.println("the elemnts in the array are");
		for (int j=0; j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		

	}

}
