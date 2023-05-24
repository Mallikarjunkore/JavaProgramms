package practice;

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=152,sum=0,rem,i,temp=n;
		while(n>0)
		{
			rem=n%10;
			i=rem*rem*rem;
			sum=sum+i;
			n=n/10;
		}
		if (temp==sum)
		{
			System.out.println("amstrong");
		}
		else
		{
			System.out.println("not amstrong");
		}

	}

}
