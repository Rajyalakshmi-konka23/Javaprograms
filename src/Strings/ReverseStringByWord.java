package Strings;

public class ReverseStringByWord {
	public static void main(String [] args) {
	String s="Rajya lakshmi Konka";
	String[] arr= s.split(" ");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i] +" ");
		
	}
	}

}
