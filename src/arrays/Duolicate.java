package arrays;

public class Duolicate 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]={10,20,30,30,38};
		for (int i=0; i<a.length; i++ )
		{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j])
			{
				System.out.println("duplicate"+a[i]);

			}
		}
		}
     }
}