package BranchingStatements;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade='B';
		switch(grade)
		{
		case 'A': System.out.println("grade is distinction");	
		break;
		case 'B': System.out.println("grade is first class");	
		break;
		case 'C': System.out.println("grade is second class");	
		break;
		case 'D': System.out.println("fail");
		break;
		default :System.out.println("invalid input");
		break;
		}


	}

}
	
