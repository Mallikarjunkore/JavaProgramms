package section2;

public class Casting {
	public static void main(String[] args)
	{
		//widening
		double d=10;
		int a=11;
		System.out.println(d);//implicit
		double d1=(double)a;
		System.out.println(d1);//explicit
		
		//narrowing.
		int c=97;
		char b=(char)c;
		System.out.println(b);//implicit
	}

}
