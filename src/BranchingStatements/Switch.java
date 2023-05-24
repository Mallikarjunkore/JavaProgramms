package BranchingStatements;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		char ch='-';
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
}
