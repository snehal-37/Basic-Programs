package demo1;

public class Lcm {
	public static void main(String[] args) {
		int a = 12;
		int b = 9;
		int i = 1;
		int gcd = 0;
		while (i <= a && i <= b) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
			i++;
		}
		int lcm=(a*b)/gcd;
		System.out.println("LCM of "+a+" & "+b+" is "+lcm);
	}
}
