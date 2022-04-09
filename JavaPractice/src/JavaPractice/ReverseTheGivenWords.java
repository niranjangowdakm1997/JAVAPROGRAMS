package JavaPractice;

public class ReverseTheGivenWords {
	
	public static void main(String[] args) {
		
	 String str="welcome to new land";
	 String[] s = str.split(" ");
	 
	 for(int i=0;i<s.length;i++)
	 {
		 String strl = s[i];
		 for(int j=strl.length()-1;j>=0;j--)
		 {
			 System.out.print(strl.charAt(j));
		 }
		 System.out.print(" ");
	 }
		
	}

}
