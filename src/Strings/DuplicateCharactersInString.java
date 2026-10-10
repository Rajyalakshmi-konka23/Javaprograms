package Strings;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String str="rajyalakshmiami";
		String duplicates="";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					if(duplicates.indexOf(str.charAt(i))==-1) {
						duplicates=duplicates+str.charAt(i);
					}
					break;
					
				}
				
				
			}
		}
		System.out.println(duplicates);

	}

}
