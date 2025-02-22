package demo3;

public class Trim {
public static void main(String[] args) {
	String s="Hello World! How are you?";
	String str="";
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if(ch!=' ') {
			str=str+ch;
			
		}
	}
	System.out.println("String without spaces: "+str);
}
}
