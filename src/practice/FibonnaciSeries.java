package practice;
import java.util.Scanner;

public class  FibonnaciSeries{
	static int n1,n2;
	public static void main1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n1 value");
		n1=sc.nextInt();
		System.out.println("enter the n2 value");
		n2=sc.nextInt();
		int sum=0;
		for(int i=1; i<=10; i++)
		{
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main1();

	}

}
