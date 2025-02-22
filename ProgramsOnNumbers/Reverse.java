package demo1;

public class Reverse {
	public static void main(String[] args) {
		int num = 121, rev = 0;
		int num1 = num;

		while (num > 0) {
			int a = num % 10;
			rev = rev * 10 + a;
			num = num / 10;
		}
		System.out.println("The reverse of the given no is " + rev);

		if (num1 == rev)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Not Palindrome");

	}
}
