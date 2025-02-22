package test;

public class Fibbonacci {
public static void main(String[] args) {
	int n1=0,n2=1,range=5;
	System.out.print(n1+" "+n2+" ");
	for (int i = 0; i < range; i++) {
		int nextterm=n1+n2;
		System.out.print(nextterm+" ");
		n1=n2;
		n2=nextterm;
	}
}
}
