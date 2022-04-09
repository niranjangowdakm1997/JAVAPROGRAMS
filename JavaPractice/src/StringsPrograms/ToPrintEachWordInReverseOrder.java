package StringsPrograms;

public class ToPrintEachWordInReverseOrder {
	
	public static void main(String[] args) {
		String str="welcome to testyantra";
		String[] s = str.split(" ");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]);
		}
		
		System.out.println("****");
		
		for(int i=0;i<s.length;i++)
		{
			String strln=s[i];
			for(int j=strln.length()-1;j>=0;j--)
			{
				
				System.out.print(strln.charAt(j));
			}
			
		}
		}
	}


