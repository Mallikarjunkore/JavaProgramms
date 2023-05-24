package whileloop;

public class Onetohundredhappynumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem=0,sum=0;
		for(int i=1; i<=100; i++)
		{
			int temp=i;
			while(i>9)
			{
				while(i>0)
				{
					rem=i%10;
					sum=sum+(rem*rem);
					i=i/10;
				}
				i=sum;
				sum=0;
				
			}
			if(i==1)
			{
				System.out.println(temp);
			}
		
			
			
		}

	}

}
