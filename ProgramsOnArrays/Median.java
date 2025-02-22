package demo2;

public class Median {

	public static int findMedian(int a[][],int i,int j) {
		int m[]=new int[i*j];
		int index=0;
		for (int k = 0; k < i; k++) {
			for (int k2 = 0; k2 < j; k2++) {
				m[index]=a[k][k2];
				index++;
			}
		}
		return m[(i*j)/2];
	}
	public static void main(String[] args) {
		int i=3,j=3;
		int a[][]= {{1,3,8},
					{2,5,4},
					{1,2,6}};
		System.out.println("Median of sorted matrix: "+findMedian(a, i, j));
	}
}
