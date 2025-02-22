package demo1;
//Decimal to Octal
public class Conversion1 {
	public static void main(String[] args) {
		int num = 25;
		String str = "";
		while (num != 0) {
			int rem = num % 8;
			str = rem + str;
			num = num / 8;
		}
		System.out.println("Decimal to Octal: " + str);
	}
}
