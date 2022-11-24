package day021;

import java.util.Map.Entry;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(2, "Sai Krishna");
		map.put(1, "Ayesha");
		map.put(3, "Bhanu Prasad");
		
		System.out.println(map);
		
		TreeSet<Entry<Integer, String>> treeSet = 
				new TreeSet<Entry<Integer, String>>(new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		treeSet.addAll(map.entrySet());
		System.out.println(treeSet);
		
		treeSet.forEach(System.out::println);
	}

}
