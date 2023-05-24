package practice;
import java.util.Scanner;

public class Perfecnumber {
	public static void main1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println("perfet number");
		}
		else 
		{
			System.out.println("not a perfect number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main1();

	}

}
