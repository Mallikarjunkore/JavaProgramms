package section3;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("java");
		a1.add(13);
		a1.add('h');
		Object a[]=a1.toArray();
		System.out.println(a);
		
		System.out.println(a1);
		for(Object x:a1)
		{
			if(x instanceof Integer) 
			{
			//int inta1 = a.length;
			}
		}
		
		

	}

}
