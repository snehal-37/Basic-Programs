package demo1;

public class Gcd {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 18;
		int i = 1;
		int gcd=0;
		while (i <= num1 && i <= num2) {
			if (num1 % i == 0 && num2 % i == 0) {
				 gcd = i;
			}
		i++;
		}
		System.out.println("GCD of "+num1+" & "+num2+" is "+gcd);	}
}
