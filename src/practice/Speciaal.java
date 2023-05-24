package practice;

public class Speciaal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=145,rem,temp=n,sum=0;
		while(n>0)
		{
			rem=n%10;
			int fac=1;
			while(rem>0)
			{
				fac=fac*rem;
				rem--;
			}
			sum=sum+fac;
			n=n/10;	
		}
		if (sum==temp)
		{
		System.out.println("special number");	
		}
		else
		{
			System.out.println("not special number");
		}

	}

}
