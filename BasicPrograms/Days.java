package test;

public class Days {
public static void main(String[] args) {
	int days=1788;
	int years=(days/365);
	int weeks=(days%365)/7;
	days=(days%365)%7;
	System.out.println(years+" "+weeks+" "+days);
}
}
