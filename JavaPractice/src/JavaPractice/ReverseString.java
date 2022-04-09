package JavaPractice;

public class ReverseString {

	public static void main(String[] args) {

		String s = "JAMES";
		System.out.println(s.length()); 

		System.out.println("***");

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
