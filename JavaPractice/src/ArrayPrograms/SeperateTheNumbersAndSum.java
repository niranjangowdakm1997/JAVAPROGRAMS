package ArrayPrograms;

public class SeperateTheNumbersAndSum {
	
	public static void main(String[] args) {
		
		String s="ab11v22r33";
		int sum=0;
		int tsum=0;
		for (int i = 0; i<s.length(); i++) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum=sum*10+s.charAt(i)-48;
			}
			else
			{
				tsum=tsum+sum;
				sum=0;
			}
		}
		System.out.println(tsum+sum);
		
	}

}
