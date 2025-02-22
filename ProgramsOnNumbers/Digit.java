package demo1;

//Appearance of x digit 
public class Digit {
	public static void main(String[] args) {
		int num = 126725242;
		int d = 2;
		int count = 0;
		while (num != 0) {
			int rem = num % 10;
			if (rem == d) {
				count++;
			}
			num = num / 10;
		}
		System.out.println(d + " is repeated " + count + " times");
	}
}
