package Strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachCharInString {

	

	

		public static void main(String[] args) {

			String str = "aabbcdd"; // a2 b2 c1 d2

			Map<Character, Integer> map = new HashMap<>();

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}

			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + ":" + entry.getValue() + " ");
			}

		}

}

