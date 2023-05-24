package Strings;

public class TocountheIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india123is456my789country";
		int count=0;
		for(int i=s.length()-1; i>=0; i--)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				count++;
			}
	    }
		System.out.println(count);


	}

}
