package demo1;

//Replace 0's with 1's
public class Replace {
	public static void main(String[] args) {
		int num = 120090;
		String bin = "";
		while (num != 0) {
			int rem = num % 10;
			if (rem == 0) {
				rem = 1;
			}
			bin = rem + bin;
			num = num / 10;
		}
		System.out.println("Number After Replacement: " + bin);
	}
}
