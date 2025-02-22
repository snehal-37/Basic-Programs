package demo3;

public class Words {
public static void main(String[] args) {
	String s="Hello, how are you?";
	System.out.println("The given String is "+s);
	int sum=1;
	int i=0;
	while(i<s.length()) {
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
			sum++;
		}
		i++;
	}
	System.out.println("Number of words in given string: "+sum);
}
}
