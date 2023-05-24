package practice;
import java.util.Scanner;
public class Switch {
	
	public static void main1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value1");
		int a=sc.nextInt();
		System.out.println("enter the value2");
		int b=sc.nextInt();
		System.out.println("enter the operation to be performed");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+': System.out.println("the addition of two numbers is " +(a+b));	
		break;
		case '-': System.out.println("the substraction of two numbers is " +(a-b));	
		break;
		case '*': System.out.println("the multiplication of two numbers is " +(a*b));	
		break;
		case '/': System.out.println("the quotient of two numbers is " +(a/b));	
		break;
		case '%': System.out.println("the reminder of two numbers is " +(a%b));	
		break;
		default :System.out.println("invalid input");
		break;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main1();

	}

}
