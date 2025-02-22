package demo1;

//Decimal to Hexadecimal
public class Hex {
	public static void main(String[] args) {
		char a[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int num = 255;
		String str = "";
		while (num != 0) {
			int rem = num % 16;
			str = a[rem] + str; //takes remainder as array index
			num = num / 16;
		}
		System.out.println("Decimal to Hexadecimal: " + str);
	}
}
