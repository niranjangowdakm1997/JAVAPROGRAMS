package PracticeOnBasicPrograms;

import java.util.Scanner;

public class FactorialUsingScanner {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int fact = sc.nextInt();
		int no = sc.nextInt();
		
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
