package test;

public class Automorphic {
	public static void main(String[] args) {
		int n = 5;
		int sq = n * n;
		int rem = sq % 10;
		if (rem == n) {
			System.out.println("automorphic");
		} else {
			System.out.println("not");
		}
	}
}
