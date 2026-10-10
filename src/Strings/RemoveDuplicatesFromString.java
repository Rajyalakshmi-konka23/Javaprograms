package Strings;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String s="Programming";
		String result="";
		for(int i=0;i<s.length();i++) {
			if(result.indexOf(s.charAt(i))==-1) {
				result=result+s.charAt(i);
			}
		}
		System.out.println(result);

	}

}
