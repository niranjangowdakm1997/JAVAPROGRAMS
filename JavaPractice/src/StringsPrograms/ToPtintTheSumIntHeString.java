package StringsPrograms;

public class ToPtintTheSumIntHeString {


	public static void main(String[] args) {
		
	String str="ab12vr31";
	int sum=0;
	
	  for (int i = 0; i <str.length(); i++) {
		  
		  if(str.charAt(i)>='0' && str.charAt(i)<='9')
		  {
			  int n=str.charAt(i)-48;
			  sum=sum+n;
		  }
	  }
  System.out.println(sum);
	
	}
}
