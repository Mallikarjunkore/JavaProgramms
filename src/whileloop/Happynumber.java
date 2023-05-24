package whileloop;

public class Happynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=97,rem=0,i=0,sum=0;
		while(n>9)
		{
		      while(n>0)
		{
			rem=n%10;
			i=rem*rem;
			sum=sum+i;
			n=n/10;
		}
		n=sum;
		sum=0;
		}
		if(n==1)
		{
			System.out.println("happy number");
		}
		else
		{
			System.out.println("not happy number");
		}

	}

}
