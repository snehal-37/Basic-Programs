package demo1;

public class Roots {
	public static void main(String[] args) {
		int a = 1;
		int b = -7;
		int c = 12;
		int d = b * b - 4 * a * c;

		double root1 = (-b + Math.sqrt(d)) / (2 * a);
		double root2 = (-b - Math.sqrt(d)) / (2 * a);
		System.out.println("Roots are: "+root1+","+root2);
	}
}
