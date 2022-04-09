package StringsPrograms;

import java.util.LinkedHashSet;

public class ToPrintTheOrderOfOccurence {
	
public static void main(String[] args) {
		
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
			set.add(s.charAt(i));
			System.out.println(set);
		}
		
		for (Character ch: set) {
		
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+"="+(i+1));
					break;//Here break which used to print without duplicate values
					
				}

			}
	}

	}

}
