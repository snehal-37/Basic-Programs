package demo1;
//Natural Number
public class Natural {
	public static void main(String[] args) {
		int range = 10;
		int sum = 0;
		for (int i = 1; i <= range; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of First " + range + " Natural no is "+ sum);
	}
}
