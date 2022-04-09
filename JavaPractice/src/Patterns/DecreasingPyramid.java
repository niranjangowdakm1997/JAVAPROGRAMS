package Patterns;

public class DecreasingPyramid {
	
	public static void main(String[] args) {
		int no=4;
		
		for (int i = 0; i <=no; i++) {
			
			for (int j =no; j <=i; j++) {
				
				System.out.print(" ");
			}
			for(int j=i;j<=no;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
