package ArrayPrograms;

public class OrderOfOccurenceInString {
	
	public static void main(String[] args) {
		
		String str = "aabbbcccc";

		for (int i = 0; i < str.length(); i++) {

			int count = 0;
			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) 
				{
                      count++;
				} 
				else 
				{
					break;
				}
			}

			i = i + count;
			count++;
			System.out.print(str.charAt(i)+"="+count);

		}
	}
}
