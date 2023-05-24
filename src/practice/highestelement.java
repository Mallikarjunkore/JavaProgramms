package practice;

public class highestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,60,50};
		int max=a[0];
		for( int i=0; i<a.length; i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("the highest elemnt in the array is "+max);

	}

}
