package PracticeOnBasicPrograms;

import java.util.Scanner;

public class PalindromeUsingScanner {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
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

