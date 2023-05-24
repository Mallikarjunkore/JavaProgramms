package section2;
import java.util.Scanner;
public class validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to facebook");
		System.out.println("enter the username");
		String Unam=sc.nextLine();
		System.out.println("enter the password");
		int Pword=sc.nextInt();
		Login a1=new Login();
		
		if(a1.getUname().equals(Unam))
		{
			System.out.println("valid username");
		}
		else
		{
			System.out.println("invalid username");
		}

	}

}
