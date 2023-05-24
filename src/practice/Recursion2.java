package practice;

public class Recursion2 {
	static int i=1;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("the numbers from 1 to 10 are");
			main1();
		}
		public static void main1()
		{
			if(i<=10)
			{
			System.out.println(i);
			i++;
			main1();
			}
			
		}

	}


