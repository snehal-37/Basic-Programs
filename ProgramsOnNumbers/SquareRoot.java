package demo1;

//Square root
public class SquareRoot {
	public static void main(String[] args) {
		int num = 25;
		double t;
		double sqrt = num / 2;
		do {
			t = sqrt;
			sqrt = (t + (num / t)) / 2;
		} while ((t - sqrt) != 0);

		System.out.println("Square root of " + num + " is " + sqrt);
	}
}
