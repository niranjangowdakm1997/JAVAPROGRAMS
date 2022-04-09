package JavaPractice;

public class StringValueWhichIsHavingMinLength {
	
	public static void main(String[] args) {
		
		String str[]= {"a","ab","adbde","hey"};
		String min=str[0];
		
		for(int i=0;i<str.length;i++)
		{
			if(min.length()>str[i].length())
			{
				min=str[i];
			}
		}
		System.out.println(min);
	}

}
