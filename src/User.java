import java.util.Scanner;
public class User
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please do the payment");
		System.out.println("select the bank to do the payment");
		int select=sc.nextInt();
		Amazon a1;
		switch(select)
		{
		case 1:a1=new ICCI();
		a1.payment();
		break;
		case 2:a1=new ICCI();
		a1.payment();
		break;
		default: System.out.println("enter the valid choice");
		}

	}

}
