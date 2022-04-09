package StringsPrograms;

import java.util.LinkedHashSet;

public class ToCountHowManyVowels {
	
	public static void main(String[] args) {
		String s="niranjan";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for (int i = 0; i<s.length(); i++) {
			
			System.out.println(s.charAt(i));
			set.add(s.charAt(i));
		}
		
		int count=0;
		for (Character ch: set) {
			
			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'  )
			{
				count++;
				System.out.print(ch);
			}
	
		}
		System.out.println("="+count);
	}

}
