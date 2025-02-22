package demo1;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153;
		int n1 = num;
		int sum=0;
		while (num != 0) {
			int rem = num % 10;
		    sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(n1==sum) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}
