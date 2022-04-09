package PracticeOnBasicPrograms;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int no=7;
		boolean flag = true;
//		
//		if(no<=1)
//		{
//			flag=false;
//		}
		
		for (int i =2; i < 7; i++) {
			
			if(no%i==0)
			{
				flag=false;
				break;
			}		
		}
		if(flag==true)
		{
			System.out.println("Its prime number");
		}
		else
		{
			System.out.println("Its not a prime number");
		}
		
		
		
	}

}
