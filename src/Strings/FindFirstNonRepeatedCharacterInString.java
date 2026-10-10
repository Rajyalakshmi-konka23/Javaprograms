package Strings;
import java.util.*;

public class FindFirstNonRepeatedCharacterInString {
	
	public static void main(String[] args) {
	
	String s="Rajyalakshmi";
	
	Map<Character,Integer> map= new HashMap<>();
	
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		map.put(ch,map.getOrDefault(ch, 0)+1);
	}
	
	for(Map.Entry<Character,Integer> entry:map.entrySet()) {
		
		
	
		if(entry.getValue()==1) {
		System.out.println(entry.getKey());
		break;
	}
	
	}
}
}
