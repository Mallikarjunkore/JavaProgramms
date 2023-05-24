package Strings;

public class StringsContainsChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mallikarjun";
		char ch='d';
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("the given string contains "+ch);

		}
		else
		{
			System.out.println("the given string does not contain "+ch);

		}

	}

}
