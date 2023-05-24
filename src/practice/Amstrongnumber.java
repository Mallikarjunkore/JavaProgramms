package practice;
import java.util.Scanner;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main1();
		

	}
	public static void main1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value to check for amstrong number");
		int n=sc.nextInt();
		int i,rem,sum=0,b=n;
		while(n>0)
		{
			rem=n%10;
			i=rem*rem*rem;
			sum=sum+i;
			n=n/10;
		}
		if(sum==b)
		{
			System.out.println(b+" is amstrong number");
		}
		else
		{
			System.out.println(b+"is not a amstrong number");
		}
	}

}
