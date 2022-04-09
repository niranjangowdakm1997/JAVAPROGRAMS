package StringsPrograms;

import java.util.LinkedHashSet;

public class ToPrintTheStringPositions {
	
	public static void main(String[] args) {

		String str = "welcome to testyantra";
		String[] s = str.split(" ");
		//char[] arr = str.toCharArray();
		//System.out.println(arr);
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		for (String cha : s) {
			
			System.out.println(cha);
			set.add(cha);
			System.out.println(set);
		}
        for(String cha1: set)
        {
        	int count=0;
        	for(int i=0;i<cha1.length();i++)
        	{
                count++;
				
			}
         System.out.println(cha1+"="+count);
        }
	}

}
