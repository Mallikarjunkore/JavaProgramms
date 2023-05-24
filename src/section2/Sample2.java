package section2;

public class Sample2 {
	public static void main(String[]args)
	{
		sample1 a1=new sample1();
		System.out.println(a1.getPword());
		System.out.println(a1.getUname());
		a1.setUname("uname");
		a1.setPword(321);
		System.out.println(a1.getPword());
		System.out.println(a1.getUname());
	}

}
