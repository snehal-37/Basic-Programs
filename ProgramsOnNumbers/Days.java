package demo1;

public class Days {
public static void main(String[] args) {
	int days=2023;
	int years=days/365;
	int weeks=(days%365)/7;
	 days=(days%365)%7;
	 System.out.println("Years "+years+" Weeks "+weeks+" Days "+days);
}
}
