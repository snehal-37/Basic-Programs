package test;

public class Leap {
	public static void main(String[] args) {
		int year = 2001;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not");
		}
	}
}
