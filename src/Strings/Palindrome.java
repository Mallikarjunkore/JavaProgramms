package Strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String s1="";
		for(int i=s.length()-1; i>=0; i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
		{
		
			System.out.println("palindrome");
		}


	}

}
