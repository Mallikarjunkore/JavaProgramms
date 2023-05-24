package whileloop;

public class Perfectsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=49,count=0;
		for(int i=1; i<=n; i++)
		{
			if(i*i==n)
		{
			count++;
				//System.out.println(n+" is perfect square");
		}
		}
			if(count==1)
			{
				System.out.println(n+" is perfect sqaure");
			}
			else
			{
			System.out.println(n+" is not perfect sqaure");
			}
		
	}
}


