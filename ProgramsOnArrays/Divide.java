package demo2;

import java.util.Arrays;
public class Divide {
public static void main(String[] args) {
	int c[]= {1,2,3,4,5,6};
	int n=c.length;
	int a[]=new int[(n+1)/2];
	int b[]=new int[n-a.length];
	for (int i = 0; i < n; i++) {
		if(i<a.length) {
			a[i]=c[i];
		}else {
			b[i-a.length]=c[i];
		}
	}
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
}
}
