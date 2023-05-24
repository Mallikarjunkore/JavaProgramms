package BranchingStatements;

public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50,b=25,c=55;
		if(a>b&&a>c)
		{
			System.out.println("a is largest");
		}
		else if(b>c)
		{
			System.out.println("b is largest");
		}
		else
		{
			System.out.println("c is largest");
		}

	}

}
