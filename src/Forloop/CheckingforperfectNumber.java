package Forloop;

public class CheckingforperfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6, sum=0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==n)
			{
				System.out.println("perfect number");
			}
			else
			{
				System.out.println("not a perfect number");
			}
		}

	}


