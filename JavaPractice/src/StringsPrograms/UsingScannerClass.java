package StringsPrograms;

import java.util.Scanner;

public class UsingScannerClass {
	public static void main(String[] args) {
		
		Scanner str=new Scanner(System.in);
		String s = str.next();
	    String alpha=" ";
	    String no=" ";
	    String spc=" ";
	
	for (int i = 0; i <s.length(); i++) {
		
		if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
		{
			alpha=alpha+s.charAt(i);
		}
		
		else if(s.charAt(i)>='0' && s.charAt(i)<='9') 
		{
			no=no+s.charAt(i);
		}

	    else
		{
			spc=spc+s.charAt(i);
		}
		
	}
	System.out.println(alpha);
	System.out.println(no);
	System.out.println(spc);
	}
}



