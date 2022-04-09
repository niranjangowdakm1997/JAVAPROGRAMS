package JavaPractice;

public class Reverse {
	
	public static void main(String[] args) {
		
		String str="JAMES";
		char[] s=str.toCharArray();
		int count=0;
		
		for(char c :s)
		{
			count++;
	
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
	}

}
