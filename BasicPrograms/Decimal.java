package test;

public class Decimal {
	public static void main(String[] args) {
		String bin = "1100";
		int dec = 0, base = 1;
		for (int i = bin.length() - 1; i >= 0; i--) {
			if (bin.charAt(i) == '1') {
				dec = dec + base;
			}
			base = base * 2;
		}
		System.out.println(dec);
	}
}
