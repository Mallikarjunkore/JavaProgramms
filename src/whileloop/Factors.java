package whileloop;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,a=6,sum=0;
		while(n<=a)
		{
			if(a%n==0)
			{
				System.out.println(n);
				sum=sum+n;
			}
			n++;
		}
	}

}
