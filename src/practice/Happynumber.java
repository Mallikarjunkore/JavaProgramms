package practice;
import java.util.Scanner;

public class Happynumber {
	
	public static void main1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value to be checked for happy");
		int n=sc.nextInt();
		int rem=0,sum=0,temp=n;
		while(n>9)
		{
			while(n>0)
			{
				rem=n%10;
				sum=sum+(rem*rem);
				n=n/10;
			}
			n=sum;
			sum=0;
		}
		if(n==1)
		{
			System.out.println(temp+" is happy number");
		}
		else
		{
			System.out.println(temp+" is not a happy number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main1();

	}

}
