package Forloop;

public class SumofMultipleof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=3; i<100; i=i+3)
		{
			sum=sum+i;
		}
		System.out.println("sum of multiples of three btwn 1 and 100 is "+sum);
	}

}
