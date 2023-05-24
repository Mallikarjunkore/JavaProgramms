package Strings;

public class TocheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mallikarjun";
		char ch='b';
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==ch)
			{
				System.out.println("string contains "+ch);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
				count++;
				break;
				}
			}
		}
		if(count==1)
		{
			System.out.println("string contains vowel "+ch);

		}
		else
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
			System.out.println("the given character is vowel but does not contain in string");
			}
			else
			{
				System.out.println("character is not present in string and is not a vowel");
			}

		}
}
}
