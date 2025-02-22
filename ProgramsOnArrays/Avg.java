package demo2;

public class Avg {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int sum=0,avg;
	for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];
	}
	avg=sum/a.length;
	System.out.println("Average of numbers in an array: "+avg);
}
}
