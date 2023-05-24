package whileloop;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234,rem;
		while(n>0)
		{
			rem=n%10;
			System.out.println(rem);
			n=n/10;
		}

	}

}
