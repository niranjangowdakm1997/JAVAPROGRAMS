package ArrayPrograms;

public class PrintPrimENumbersInArray {
	
public static void main(String[] args) {
		
		int a[]= {4,2,3,5,8,6,7};
		
		for (int i = 0; i < a.length; i++) {
			
			int n=a[i];
			int j=2;
			while(j<=n)
			{
				if(n%j==0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			
		if(n==j)
		{
			System.out.println(n);
		}
		
	}
}

}
