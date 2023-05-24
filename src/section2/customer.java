package section2;
import java.util.Scanner;
public class customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to chocalate shop");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the chocalte number");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: kitkat a1=new kitkat();
		a1.chocalate();
		break;
		case 2:  milkybar a2=new milkybar();
		a2.chocalate();
		break;
		case 3: dairymilk a3=new dairymilk();
		a3.chocalate();	
		break;
		default :System.out.println("invalid input");
		break;
		}
	}
}
