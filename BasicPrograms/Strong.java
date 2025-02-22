package test;

public class Strong {
	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int num = 145, n1 = num, sum = 0;
		while (num != 0) {
			int rem = num % 10;
			int digit = fact(rem);
			sum = sum + digit;
			num = num / 10;
		}
		if (n1 == sum) {
			System.out.println("Strong");
		} else {
			System.out.println("Not");
		}
	}
}
