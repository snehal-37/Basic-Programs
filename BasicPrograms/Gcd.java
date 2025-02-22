package test;

public class Gcd {
	public static void main(String[] args) {
		int n1 = 12, n2 = 18, gcd = 0, i = 1;
		while (i <= n1 && i <= n2) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
			i++;
		}
		//int lcm=(n1*n2)/gcd;
		System.out.println(gcd);
	}
}
