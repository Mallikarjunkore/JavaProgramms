
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1231, sum=0,rem,temp =n;
		while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if (temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
