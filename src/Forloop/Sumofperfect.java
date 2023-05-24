package Forloop;

public class Sumofperfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add=0;
		for (int j=1; j<=100; j++)
		{
			int sum=0;
		for(int i=1; i<j; i++)
		{
			if(j%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==j)
			{
				add=add+j;
			}
	}
		System.out.println(add);

}
}
