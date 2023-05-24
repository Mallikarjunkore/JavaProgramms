package practice;
import java.util.Scanner;

public class Palindrome {
	
	public static void main1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value ");
		int n=sc.nextInt();
		int sum=0,rem=0,temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("the given number is palindrome");
		}
		else
		{
			System.out.println("the given number is not a palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main1();

	}

}
