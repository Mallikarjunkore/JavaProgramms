package whileloop;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234,rem,sum=0;
		while(n>0)
		{
			rem=n%10;
			if(rem%2==1) 
			{
				sum=sum+rem;
			}
			n=n/10;
		}
			System.out.println(sum);


	}

}
