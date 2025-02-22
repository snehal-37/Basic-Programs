package test;

public class Binary {
public static void main(String[] args) {
	int num=8;
	String str="";
	while(num!=0) {
		int rem=num%2;
		str=rem+str;
		num=num/2;
	}
	System.out.println(str);
}
}
