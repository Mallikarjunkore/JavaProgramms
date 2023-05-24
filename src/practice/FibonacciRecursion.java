package practice;
import java.util.Scanner;
class  FibonacciRecursion
{
	static int n1,  n2,i=1,sum=0;
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n1");
		n1=sc.nextInt();
		System.out.println("enter the value of n2");
		n2=sc.nextInt();
		System.out.println("the fibbonacci series are");
		m1();
	}

	public static void m1()
	{
		if(i<=10)
		{
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			i++;
			m1();
		}

	}

}
