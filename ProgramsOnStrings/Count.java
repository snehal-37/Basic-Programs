package demo3;

public class Count {
	public static void main(String[] args) {
		String str = "s1a2m3e";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				sum = (sum + str.charAt(i) - '0');
			}
		}
		System.out.println("Sum: " + sum);
	}
}
