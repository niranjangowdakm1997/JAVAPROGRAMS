package ArrayPrograms;

public class PrintNumbersBasedOnKey {
	
	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 4, 5, 6 };

		int key=2; //key is nothing but index value

		for (int i = 0; i < key; i++) { //which is used to iterate based on the key value

			int temp = a[0]; //value which is present in first index stored in temporary variable
			for (int j = 0; j < a.length - 1; j++) {

				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp; //value which is stored in the temp variable will be stored in last index
		}
		for (int k = 0; k < a.length; k++) {

			System.out.print(a[k]);
		}
	}

}
