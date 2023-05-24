package scanner;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		

	}

}
