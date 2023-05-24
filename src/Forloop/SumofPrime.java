package Forloop;

public class SumofPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int j=1; j<=100; j++)
		{
			int count=0;
			for(int i=1; i<=j; i++)
			{
				if (j%i==0)
				{
					count++;
				}
			}
				if(count==2)
				{
					sum=sum+j;
				}
			}
		System.out.println("sum of prime numbers btwn one to hundred is"+ sum);
		}
	}
