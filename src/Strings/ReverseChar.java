package Strings;

public class ReverseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		String s1="";
		for(int i=(s.length()-1); i>=0; i--)
		{
			System.out.println(s.charAt(i));
			s1=""+s.charAt(i);
		}
		System.out.println(s1);
	}
}
