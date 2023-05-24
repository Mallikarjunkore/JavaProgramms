package whileloop;

public class Firstdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234,rem=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
		}
		System.out.println(rem);

	}

}
