package Strings;

public class ReplaceWordInString {

	public static void main(String[] args) {
		String s="I like Tea";//I like Java
		//s.replace("tea", "Java");
		//System.out.println(s);
		
		String[] arr=s.split(" ");
		for(String a:arr) {
			if(a=="Java") {
				a="Tea";
			}
			System.out.print(a +" ");
		}
		

	}

}
;