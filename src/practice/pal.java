package practice;

public class pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="madama";
		String s1="";
		for(int i=s.length()-1; i>=0; i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}

}
