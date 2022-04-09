package StringsPrograms;

import java.util.LinkedHashSet;

public class ToCheckHowManyDuplicateNumbersAreThere {

	public static void main(String[] args) {

		int[] a = { 10, 20, 10, 40, 30, 60, 30, 50 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length - 1; i++) {
			System.out.println(a[i]);
			set.add(a[i]);
			System.out.println(set);
		}
		for (Integer b : set) {

			int count = 0;
			for (int i = 0; i < a.length; i++) {

				if (a[i] == b) {

					count++;
				}

			}
			System.out.println(b + "=" + count);
		}

		// if to print only duplicate values

		System.out.println("with duplicates");

		for (Integer b : set) {

			int count = 0;
			for (int i = 0; i < a.length; i++) {

				if (a[i] == b) {

					count++;
				}

			}
			if (count > 1) {
				System.out.println(b + "=" + count);
			}

		}

		// To print values without duplicate values

		System.out.println("without duplicate values");

		for (Integer b : set) {

			int count = 0;
			for (int i = 0; i < a.length; i++) {

				if (a[i] == b) {

					count++;
				}

			}
			if (count == 1) {
				System.out.println(b + "=" + count);
			}

		}
	}
}
