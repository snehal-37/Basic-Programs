package test;

public class Square {
	public static void main(String[] args) {
		int n = 35;
		boolean isSquare = true;
		for (int i = 1; i * i <= 36; i++) {
			if (n % i == 0 && n / i == i) {
				isSquare = false;
			}
		}
		if (isSquare) {
			System.out.println("Not");
		} else {
			System.out.println("Square");
		}
	}
}
