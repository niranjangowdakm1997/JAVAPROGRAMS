package PracticeOnBasicPrograms;

import java.util.Scanner;

public class PrimeNumberScannerClass {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Type Here");
		int no = sc.nextInt();
		boolean flag = true;

		if (no <= 1) {
			flag = false;
		}

		for (int i = 2; i <no; i++) {

			if (no % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Its prime number");
		} else {
			System.out.println("Its not a prime number");
		}

	}
	
}

