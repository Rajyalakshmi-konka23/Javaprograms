package Strings;

public class RemoveDigitsFromString {

	public static void main(String[] args) {
		String str="qwerty123456";
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i)>='0' && str.charAt(i)<='9')){
				System.out.print(str.charAt(i));
			}
		}

	}

}
