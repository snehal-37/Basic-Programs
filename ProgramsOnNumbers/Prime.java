package demo1;
public class Prime {
/*public static void main(String[] args) {
	int num=65;
	boolean isPrime=true;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			isPrime=false;
		}
	}
	if(isPrime) {
		System.out.println("Prime");
}else {
	System.out.println("Not Prime");
}
}*/
	public static void main(String[] args) {
		int num=12;
		int flag=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				flag=1;  
		}
		if(num==1) {
			System.out.println("neither prime nor composite");
		}else
		if(flag==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
