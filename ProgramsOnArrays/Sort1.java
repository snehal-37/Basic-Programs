package demo2;

public class Sort1 {
	public static void sort(int a[], int n) {
		int count0 = 0, count1 = 0, count2 = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == 0)
				count0++;                //4
			if (a[i] == 1)
				count1++;                //4
			if (a[i] == 2)
				count2++;                //4
		}
		for (int i = 0; i < count0; i++)
			a[i] = 0;
		for (int i = count0; i < (count0 + count1); i++)
			a[i] = 1;
		for (int i = (count0 + count1); i < n; i++)
			a[i] = 2;
		printArray(a, n);
	}

	public static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 2, 0, 0, 2, 1, 0, 1, 2, 0 ,2};
		int n = a.length;
		sort(a, n);
	}
}
