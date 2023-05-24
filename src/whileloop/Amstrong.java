package whileloop;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,i,rem,sum=0,b=n;
		while(n>0)
		{
			rem=n%10;
			i=rem*rem*rem;
			sum=sum+i;
			n=n/10;
		}
		if(sum==b)
		{
			System.out.println(b+" is amstrong number");
		}
		else
		{
			System.out.println(b+"is not a amstrong number");
		}

	}

}
