package day019;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		String name = "anandAD000";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
//			if (ch >= 65 && ch <= 90)
//				ch += 32;
			map.putIfAbsent(ch, 0);
			map.put(ch, map.get(ch) + 1);
		}
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map);
		
		System.out.println(map);
	}

}
