package Forloop;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7,count=0;
		for(int i=1; i<=n; i++)
		{
				if(n%i==0)
			{
					count++;
			}
			}
			if(count==2)
			{
				System.out.println("prime");
			}
		
			else
			{
				System.out.println("not prime");
			}
				}
	}


			

	
				
		
