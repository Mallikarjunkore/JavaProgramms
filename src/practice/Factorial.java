package practice;
import java.util.Scanner;

public class Factorial {

	public static void main1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		int rem=0,fac=1;
		while(n>0)
		{
			rem=n%10;
			fac=fac*rem;
			n--;
		}
		System.out.println(fac);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main1();
		

	}

}
