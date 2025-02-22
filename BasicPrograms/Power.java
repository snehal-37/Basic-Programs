package test;

public class Power {
	public static void main(String[] args) {
		int base = 5, expo = 3, result = 1;
		for (int i = 1; i <= expo; i++) {
			result=result*base;
		}
		System.out.println(result);
	}
}
