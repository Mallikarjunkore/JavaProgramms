package practice;

public class ams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=145,rem,sum=0,temp=n;
		while(n>0)
		{
			rem=n%10;
			int fac=1;
			for (int i=rem; i>=1; i--)
			{
			fac=fac*i;
			}
			sum=sum+fac;
			System.out.println(sum);
			n=n/10;
		}
		if (temp==sum)
		{
			System.out.println("special");
		}
		else
		{
			System.out.println("not special");
		}

	}

}
