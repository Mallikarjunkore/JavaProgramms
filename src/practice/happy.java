package practice;

public class happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=97,rem,sum=0;
		while(n>9)
		{
			while(n>0)
			{
				rem=n%10;
				rem=rem*rem;
				sum=sum+rem;
				n=n/10;
			}
			n=sum;
			sum=0;
		}
		if(n==1)
		{
			System.out.println("happy number");
		}

	}

}
