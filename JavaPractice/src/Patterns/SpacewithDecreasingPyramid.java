package Patterns;

public class SpacewithDecreasingPyramid {
	public static void main(String[] args) {
		
	int no=4;
	
	for(int i=0;i<=no;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(" ");
		}
		for (int k=i;k<=no;k++) 
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
