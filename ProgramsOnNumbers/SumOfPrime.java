package demo1;

//Sum of Prime Number
public class SumOfPrime {
	public static void main(String[] args) {
		int range = 10;
		int sum = 0;
		for (int i = 1; i <= range; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0 && i != 1) {
				sum = sum + i;
			}
		}
		System.out.println("The Sum of Prime Numbers from 1 to " + range + " is " + sum);
	}
}
