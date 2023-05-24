package practice;

public class Recursion4 {
	static char ch='a';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Alphabets from a to z are");
		main1();
	}
	public static void main1()
	{
		if(ch<='z')
		{
		System.out.print(" "+ch);
		ch++;
		main1();
		}
		

	}

}
