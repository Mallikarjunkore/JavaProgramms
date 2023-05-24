package scanner;

public class Practice123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//perfect square numbers
		
		for(int j=1; j<=100; j++)
		{
			for(int i=1; i<=j; i++)
			{
				if(i*i==j)
				{
					System.out.println(j);
				}
			}
		}

	}

}
