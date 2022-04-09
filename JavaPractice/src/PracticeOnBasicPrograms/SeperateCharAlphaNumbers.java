package PracticeOnBasicPrograms;

public class SeperateCharAlphaNumbers {
	
	public static void main(String[] args) {
		String s="abc1%$w233Abc&";
		String alpha=" ";
		String no=" ";
		String spc=" ";
		
		for (int i = 0; i <s.length(); i++) {
			
			if(Character.isAlphabetic(s.charAt(i)))
			{
				alpha=alpha+s.charAt(i);
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				no=no+s.charAt(i);
			}
			else
			{
				spc=spc+s.charAt(i);
			}
			
			
		}
		System.out.println(alpha);
		System.out.println(no);
		System.out.println(spc);
	}

}
