package whileloop;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=9,lcm;
		int c=(a>b)?a:b;
		lcm=c;
		while(true)
		{
			if(lcm%a==0&&lcm%b==0)
			{
				System.out.println(lcm);
				break;
			}
			lcm++;
		}

	}

}
