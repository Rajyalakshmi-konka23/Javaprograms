package Strings;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		  String s="Hello World";//olleH dlroW
		  String[] arr=s.split(" ");
		  for(String a:arr){
		      for(int i=a.length()-1; i>=0;i--){
		          System.out.print(a.charAt(i));
		      }
		      System.out.print(" ");
		  }

	}

}


