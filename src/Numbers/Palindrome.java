package Numbers;

public class Palindrome {

	public static void main(String[] args) {
		int num= 123456789;
		int rev=0;
		int temp=num;
		while(num!=0) {
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(rev==temp) {
			System.out.println("Given num is palindrome");
		}
		else {
			System.out.println("Given num is not palindrome");
		}
	}

}
