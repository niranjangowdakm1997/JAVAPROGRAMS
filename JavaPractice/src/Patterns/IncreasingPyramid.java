package Patterns;

public class IncreasingPyramid {
	
	public static void main(String[] args) {
		int no=4;
		
		for (int i = 0; i <=no; i++) {
			
			for (int j = 0; j <=i; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
