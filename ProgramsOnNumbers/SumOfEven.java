package demo1;

public class SumOfEven {
public static void main(String[] args) {
	int range=10;
	int sum=0;
	for(int i=1;i<=range;i++){
		if(i%2==0) {   //if(i%2!=0)-->for odd 
			sum=sum+i;
		}
	}
	System.out.println("Sum of Even Digits: "+sum);
}
}
