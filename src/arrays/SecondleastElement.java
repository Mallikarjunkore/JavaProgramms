package arrays;

public class SecondleastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,45,3,24},temp;
		for (int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
		     }
			
		}
		System.out.println(a[a.length-2]);


	}

}
