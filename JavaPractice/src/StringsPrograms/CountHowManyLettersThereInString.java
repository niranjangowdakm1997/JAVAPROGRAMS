package StringsPrograms;

import java.util.LinkedHashSet;

public class CountHowManyLettersThereInString {
	
public static void main(String[] args) {
		
		String s="testyantra";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		//set which is used to store characters without duplicates
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
			set.add(s.charAt(i));
			System.out.println(set);
		}
		
		for (Character ch: set) {
			
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
					
				}

			}
			System.out.println(ch+"="+count);
			
			
		    }
		
	}


}
