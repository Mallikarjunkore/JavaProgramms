package Strings;

public class TocounttheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india is my country";
		int count=1;
		for(int i=s.length()-1; i>=0; i--)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
	    }
		System.out.println(count);

}
}
