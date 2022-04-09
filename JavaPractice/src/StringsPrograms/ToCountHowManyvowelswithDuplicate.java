package StringsPrograms;

public class ToCountHowManyvowelswithDuplicate {
	
	public static void main(String[] args) {
		String str="niranjan";
		 char[] s = str.toCharArray();
		 System.out.println(s);
		 int count=0;
		 for (int i = 0; i<s.length; i++) {
			
			 
			 if(s[i]=='a' || s[i]=='e' || s[i]=='i'|| s[i]=='o' || s[i]=='u'  )
				{
					count++;
					System.out.print(s[i]);
				}
		}
		 System.out.print("="+count); 
	}

}
