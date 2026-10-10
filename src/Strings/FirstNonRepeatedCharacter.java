package Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	public static void main(String [] args) {

	String str = "swiss";

    HashMap<Character, Integer> map = new HashMap<>();

    // Count frequency
    for (char ch : str.toCharArray()) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    // Find first character with frequency 1
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 1) {
            System.out.println("First non-repeated character: " + entry.getKey());
            break;
        }
    }
}
}