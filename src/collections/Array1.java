package collections;

import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add('h');
		a1.add("india");
		System.out.println(a1);
		System.out.println(a1.get(1));
		ArrayList a2=new ArrayList();
		a1.add(15);
		a1.add(25);
		a1.add('m');
		a1.add("indians");
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println(a1.contains("india"));
		a1.set(0,1);
		a1.set(1,100);
		System.out.println(a1);
		for(int i=0; i<a1.size(); i++)
		{
			Object obj=a1.get(i);
			System.out.println(obj);
		}
		

	}

}
