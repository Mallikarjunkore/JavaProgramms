package Strings;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		String s1=reversestring(s);
		if(s1.equals(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}
	
	public static String reversestring(String s)
	{
		String s1="";
		for(int i=s.length()-1; i>=0; i--)
		{
			s1=s1+s.charAt(i);
		}
		return s1;
		
	}

}
