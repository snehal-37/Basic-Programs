package demo3;

public class Length {
public static void main(String[] args) {
	String str="hello";
	int length=0;
	for(char ch:str.toCharArray()) {
		length++;
	}
	System.out.println("Length of the given String is :"+length);
}
}
