package Patterns;

public class Rhombus {
	
	public static void main(String[] args) {
		
		int no=5;
		
		for (int i=1;i<=no;i++) {
			
			for(int j=i;j<=no;j++)
			{
				System.out.print(" ");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
         for (int i2=1;i2<=no;i2++) {
			
			for(int j2=1;j2<=i2;j2++)
			{
				System.out.print(" ");
			}
			for(int k2=i2;k2<no;k2++)
			{
				System.out.print("*");
			}
			for(int l2=i2;l2<=no;l2++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
