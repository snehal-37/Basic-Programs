package demo1;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 125;
		int n,sum=0;
		while(num>0) {
			n=num%10;
			sum=sum+n;
			num=num/10;
		}
		System.out.println("Sum of Digits:"+sum);
	}
}
