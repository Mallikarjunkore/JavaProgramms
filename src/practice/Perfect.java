package practice;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6,count=0;
		for (int i=1; i<=n; i++) 
		{
			if(i*i==n)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("perfect square");
		}
		else
		{
			System.out.println("not a perfect square");
		}

	}

}
