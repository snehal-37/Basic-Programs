package demo2;

import java.util.Arrays;

public class Compare {
	static int first(int a[], int start, int end, int x, int n) {
		if (end >= start) {
			int mid = start + (end - start) / 2;
			if ((mid == 0 || x > a[mid - 1]) && a[mid] == x)
				return mid;
			if (x > a[mid])
				return first(a, (mid + 1), end, x, n);
			return first(a, start, (mid - 1), x, n);
		}
		return -1;
	}

	static void sortAccording(int x[], int y[], int m, int n) {
		int temp[] = new int[m], visited[] = new int[m];
		for (int i = 0; i < m; i++) {
			temp[i] = x[i];
			visited[i] = 0;
		}
		Arrays.sort(temp);
		int ind = 0;
		for (int i = 0; i < n; i++) {
			int f = first(temp, 0, m - 1, y[i], m);
			if (f == -1)
				continue;
			for (int j = f; (j < m && temp[j] == y[i]); j++) {
				x[ind++] = temp[j];
				visited[j] = 1;
			}
		}
		for (int i = 0; i < m; i++) {
			if (visited[i] == 0)
				x[ind++] = temp[i];
		}
	}

	static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int a[] = { 3, 4, 6, 3, 6, 2, 1, 1, 2, 1 };
		int b[] = { 1, 4, 6, 2, 3 };
		int m = a.length;
		int n = b.length;
		System.out.println("Sorted Array is ");
		sortAccording(a, b, m, n);
		printArray(a, m);
	}
}
