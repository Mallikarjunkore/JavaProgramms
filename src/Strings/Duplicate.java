package Strings;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javaaa";
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
			     if(s.charAt(i)==s.charAt(j))
			     {
			    	 count++;
			     } 
			}
		}
		if(count>1)
		{
			System.out.println("string contains duplicates");
		}
		else
		{
			System.out.println("string does not contain duplicates");
		}



	}

}
