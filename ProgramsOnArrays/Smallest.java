package demo2;

public class Smallest {
	public static void main(String[] args) {
		int a[] = { 23, 45, 21, 67, 54, 89 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
