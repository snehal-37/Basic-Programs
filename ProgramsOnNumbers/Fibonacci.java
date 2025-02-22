package demo1;

public class Fibonacci {
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+" "+num2+" ");
		for (int i = 0; i < 5; i++) {
			int nextterm = num1 + num2;
			System.out.print(nextterm+" ");
			num1=num2;
			num2=nextterm;
		}
	}
}
