package demo2;

public class Search {
	public static void main(String[] args) {
		int a[] = { 12, 34, 56, 78, 23, 98 };
		int target = 56, count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println(target + " present in an array");

		} else {
			System.out.println("Number is not present in an array");
		}
	}
}
