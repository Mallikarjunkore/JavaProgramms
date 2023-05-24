package whileloop;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=99,sum=0;
		while(i<=199)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);

	}

}
