package StringsPrograms;

import java.util.LinkedHashSet;

public class ToPrintOnlyDuplicatesValuesInString {
	
public static void main(String[] args) {
		
		String s="testyantra";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
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
			if(count>1)
			{
				System.out.println(ch+"="+count);		
				
			}
			
		    }
		
	}


}
