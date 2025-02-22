package demo3;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter array limit: ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Displaying array elements");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n/2; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = n/2; j < n; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Elements.....");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
