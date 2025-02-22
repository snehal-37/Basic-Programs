package demo1;
//Strong Number
public class Strong {
	public void isStrong() {
		int num = 145;
		int n = num; // store in another variable for comparison
		int sum = 0;
		while (num != 0) {
			int rem = num % 10; // returns remainder
			int digit = fact(rem); // takes factorial of remainder as input
			sum = sum + digit; // store each digit's factorial into variable sum
			num = num / 10; // returns quotient
		}
		if (n == sum) {
			System.out.println("Number is Strong Number");
		} else {
			System.out.println("Number is not Strong Number");
		}
	}

	public int fact(int num1) {
		int fact = 1;
		for (int i = 1; i <= num1; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Strong obj = new Strong();
		obj.isStrong();
	}
}
