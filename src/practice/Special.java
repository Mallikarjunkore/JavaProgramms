package practice;

import java.util.Scanner;
class Special 
{
	static int n,rem=0,sum=0,temp;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		n=sc.nextInt();
		m1();

	}

	public static void m1()
	{
		int fac=1;
		if(n>0)
		{
			rem=n%10;
			for(int i=1; i<=rem; i++)
			{
				fac=fac*i;
			}
			sum=sum+fac;
			n=n/10;
			m1();
		}
		else 
		{
			if(temp==sum)
			{
				System.out.println("special number");
			}
			else
			{
				System.out.println("not special");
			}
		}
	}
}

