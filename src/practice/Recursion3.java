package practice;

public class Recursion3 {

	static int i=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the numbers from 10 to 1 are");
		main1();
	}
	public static void main1()
	{
		if(i>=1)
		{
		System.out.println(i);
		i--;
		main1();
		}
		
	}
	}

