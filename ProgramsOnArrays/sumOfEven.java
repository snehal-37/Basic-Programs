package demo2;

public class sumOfEven {
	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 1, 2, 3, 4 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println("Sum of Even no: " + sum);
	}
}
