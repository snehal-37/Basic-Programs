package demo2;

public class Sort {
	public static void main(String[] args) {
		int a[] = { 12, 32,  2, 10, 68, 90, 56 };
		int temp;
		// for loop for checking each no in an array
		for (int i = 0; i < a.length; i++) { // i goes till 5th index (56)
			// for loop for sorting
			for (int j = 0; j < a.length / 2; j++) { // j goes till 6/2=3rd index (68)
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			for (int j = a.length / 2; j < a.length - 1; j++) {// j initialized with 3rd index (68)
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
