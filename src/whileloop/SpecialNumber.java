package whileloop;

public class SpecialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=145,sum=0,rem,temp=n;
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
		if(sum==temp)
		{
			System.out.println("number is amstrong");
		}
		else
		{
			System.out.println("number is not amstrong");
		}

	}

}
