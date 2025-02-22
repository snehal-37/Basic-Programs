package demo1;

//Binary to Decimal
public class Conversion2 {
	public static void main(String[] args) {
		String bin = "1110";
		int dec = 0;
		int base = 1;
		for (int i = bin.length() - 1; i >= 0; i--) {
			if (bin.charAt(i) == '1') {
				dec = dec + base;
			}
			base = base * 2;
		}
		System.out.println("Binary to Decimal: " + dec);
	}
}
