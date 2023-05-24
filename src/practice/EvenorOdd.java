
package practice;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				main1();

	}
	
	public static void main1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}

}
