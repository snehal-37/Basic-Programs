package demo3;

public class Order {
	public static String revWords(String str) {
		char[] ch = str.toCharArray();
		reverse(ch, 0, ch.length - 1);
		int start = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				reverse(ch, start, i - 1);
				start = i + 1;
			}
		}
		reverse(ch, start, ch.length - 1);
		return new String(ch);
	}

	public static void reverse(char[] a, int l, int r) {
		while (l < r) {
			char temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}
	}

	public static void main(String[] args) {
		String str = "Hello World How are you..?";
		String revString = revWords(str);
		System.out.println("Reversed Sentence: " + revString);
	}
}
