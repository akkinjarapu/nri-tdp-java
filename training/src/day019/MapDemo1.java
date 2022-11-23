package day019;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo1 {

	public static void main(String[] args) {
		String name = "anand";

		HashMap<Character, Integer> map = new HashMap<>();

		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}

		System.out.println(map);
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
			System.out.println(entry);
		}
			
	}

}
