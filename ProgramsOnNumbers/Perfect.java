package demo1;
//Perfect Number
public class Perfect {
	public static void main(String[] args) {
		int num = 496;
		int sum = 0;
		int i = 1;
		while (i <= num / 2) {
			if (num % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if(sum==num) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not Perfect Number");
		}
	}
}
