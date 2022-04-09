package JavaPractice;

public class WithoutUsingThirdVariablePrintReverse {
	 public static void main(String[] args) {
		
	
	String str="JAMES";
	char[] s=str.toCharArray();
	
	String rev="";
	
	int count=0;
	
	for(char c: s)
	{
		count++;
		System.out.println(c);
	}
	for(int i=count-1;i>=0;i--)
	{
		rev=rev+str.charAt(i); 
		
	}
	System.out.println(rev);
	 }

}
