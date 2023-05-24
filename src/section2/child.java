package section2;

public class child extends ClassTypecasting {
	public void m2()
	{
		System.out.println("im child class");
	}
	public static void main(String[] args) 
	{
		ClassTypecasting a1=new child();//implicit upcasting
		a1.m1();
		//a1.m2();
		ClassTypecasting a2=(ClassTypecasting)new child();//explicit upcasting
		a2.m1();
		child a3=(child)a2;//can be done only explicitly after the upcasting.
		a3.m2();
	}

}
