package demo2;

public class MatrixMult {
	public static void main(String[] args) {
		int a[][] = { { 3, 4, 4 }, { 2, 7, 1 }, { 8, 1, 2 } };
		int b[][] = { { 9, 5, 0 }, { 7, 3, 4 }, { 7, 2, 1 } };
		int c[][] = new int[a.length][b.length];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] * a[i][j];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
