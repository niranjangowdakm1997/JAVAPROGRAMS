package StringsPrograms;

import java.util.LinkedHashSet;

public class ToRemoveTheDuplicateWords {
	
	public static void main(String[] args) {

		String str = "welcome to to testyantra";
		String[] s = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();

		for (String word1 : s) {

			System.out.println(word1);
			//add values to the set
			set.add(word1);
			//set without the duplicate values
			System.out.println(set);

		}

		for (String word2 : set) {

			int count = 0;

			for (String word3 : set) {

				if (word3.equals(word2)) {
					count++;
				}

			}
			System.out.println("*count the string without thw duplicate values*");
			System.out.println(word2 + "=" + count);
		}
		
        //Which is used to print the duplicate values
		
		System.out.println("*with duplicate values*");
		for (String word4 : set) {
			int count = 0;

			for (String word5 : s) {

				if (word5.equals(word4)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(word4 + "=" + count);
			}
		}
		
		//which is used to print non-duplicate values
		
		System.out.println("*without duplicate values*");
		for (String word4 : set) {
			int count = 0;

			for (String word5 : s) {

				if (word5.equals(word4)) {
					count++;
				}
			}
			if (count==1) {
				System.out.println(word4 + "=" + count);
			}
		}

	}

}
