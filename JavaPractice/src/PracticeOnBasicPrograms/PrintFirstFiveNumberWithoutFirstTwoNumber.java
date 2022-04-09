package PracticeOnBasicPrograms;

public class PrintFirstFiveNumberWithoutFirstTwoNumber {
	
	public static void main(String[] args) {
		
		int fib1=0;
		int fib2=1;
		int fib3;
		
		//System.out.println(fib1);
		//System.out.println(fib2);
		
		for (int i=0;i<5;i++) {
			
			fib3=fib1+fib2;
			fib2=fib3;
			fib1=fib2;
			System.out.println(fib3);
		}
		
	}

}
