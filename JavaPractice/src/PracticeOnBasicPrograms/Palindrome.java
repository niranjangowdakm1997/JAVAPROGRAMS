package PracticeOnBasicPrograms;

public class Palindrome {
	
	public static void main(String[] args) {
		String s="MOM";
		String rev="";
		
		for (int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println(rev);
			System.out.println("Its palindrome");
		}
		else
		{
			System.out.println(rev);
			System.out.println("Its not a Palindrome");
		}
	}

}
