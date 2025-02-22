package demo3;

public class Email {
public static void main(String[] args) {
	String str1="abc1234@gmail.com";
	String str="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	boolean result=str1.matches(str);
	if(result)
		System.out.println("Email-id is Valid");
	else
		System.out.println("Email-id is not Valid");
}
}
