package PracticeOnBasicPrograms;

public class Factorial {
	
	public static void main(String[] args) {
		int fact=1;
		int no=5;
		
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
