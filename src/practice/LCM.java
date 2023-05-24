package practice;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=9,c;
		c=(a>b)?a:b;
		int LCM=c;
		while(true)
		{
			if(LCM%a==0&&LCM%b==0)
			{
				System.out.println(LCM);
				break;
			}
			LCM++;
		}

	}

}
