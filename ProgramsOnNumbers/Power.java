package demo1;

public class Power {
	public static void main(String[] args) {
		int base=16;
		int expo=2;
		int result=1;
		for(int i=1;i<=expo;i++) {
			result=result*base;
		}
		System.out.println("Answer:"+result);
	}
}
