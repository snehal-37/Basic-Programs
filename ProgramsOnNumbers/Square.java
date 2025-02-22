package demo1;

public class Square {
public static void main(String[] args) {
	int num=0;
	boolean isSquare=true;
	for(int i=1;i*i<=num;i++) {
		if((num%i==0)&&(num/i==i)) {
			isSquare=false;
		}
	}
	if(num==0||isSquare) {
		System.out.println("Not Perfect Square");
	}else {
		System.out.println("Perfect Square");
	}
}
}
