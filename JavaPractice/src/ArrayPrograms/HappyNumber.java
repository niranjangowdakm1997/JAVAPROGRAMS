package ArrayPrograms;

public class HappyNumber {
	
	public static void main(String[] args) {
		int no=568;
		
	while(no>9)
	{
		int sum=0;
		while(no>0)
		{
			int n=no%10;
			sum=sum+n;
			no=no/10;
		}
	   no=sum;
	}
	System.out.println(no);
		
		
	}

}
