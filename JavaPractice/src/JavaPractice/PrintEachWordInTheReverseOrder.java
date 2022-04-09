package JavaPractice;

public class PrintEachWordInTheReverseOrder {
	
	public static void main(String[] args) {
		
	
	     String str="welcome to testyantra";
	     String[] s=str.split(" ");
	      
	      
	     for(int i=0;i<s.length;i++)
	     {
             String strln=s[i];
	    	 for(int j=strln.length()-1;j>=0;j--)
	    	 {
	    		 System.out.print(strln.charAt(j));
	    	 }
	    	System.out.print("");
	     }
	}
}
