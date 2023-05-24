package section3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Diplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,10,30,40,40};
		ArrayList a1=new ArrayList();
		
		for(int i=0; i<a.length; i++)
		{
			a1.add(i,a[i]);
		}
		System.out.println(a1);
		HashSet<Integer> a2=new HashSet<Integer>(a1);
		System.out.println(a2);
		Object [] b=a2.toArray();
		
		for(int i=0; i<b.length; i++ )
		{
			System.out.println(a[i]);
		}
		
		
		
		//System.out.println(b);
		
		 /*HashSet<String> set = new HashSet<String>();
	        set.add("1");
	        set.add("13");
	        set.add("27");
	        set.add("87");
	        set.add("19");
	  
	        System.out.println("Hash Set Contains :" + set);
	        String arr[] = new String[set.size()];
	        
	        // toArray() method converts the set to array
	        set.toArray(arr);
	        //System.out.println(arr);
	        for (String n : arr) {
	            System.out.println(n);
	        }
	*/
	}

}
