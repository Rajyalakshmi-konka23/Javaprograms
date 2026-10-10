package Strings;

public class RemoveLowerCaseFRomString {

	public static void main(String[] args) {
	String str="HelloWorld";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
			System.out.print(str.charAt(i));
		}
	}
	}

}

