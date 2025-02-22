package demo3;

public class Concat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		String s=new String(s1.concat(s2));
		System.out.println(s);
		//System.out.println("String after concatenation is " + s1 +" "+ s2);
	}
}
