package BranchingStatements;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='e';
		if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z'))
		{
		
			System.out.println("ch is alphabet");
		
		if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' )||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
		{
			System.out.println("ch is vowel");
		}
		else
		{
			System.out.println("ch is not vowel");
		}
	    }
		else
		{
			System.out.println("ch is not alphabet");
		}

	}

}
