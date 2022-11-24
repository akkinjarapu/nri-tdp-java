package day022;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> countries = new HashMap<>();
		countries.put("Australia", 2);
		countries.put("India", 1);
		countries.put("South Africa", 3);
		System.out.println(countries);
		
		TreeMap<String, Integer> countriesSorted = new TreeMap<>(countries);
		System.out.println(countriesSorted);
		
		Set<Entry<String, Integer>> entrySet = countries.entrySet();
		
		TreeSet<Entry<String, Integer>> sortedSet = 
				new TreeSet<>(new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		sortedSet.addAll(entrySet);
		System.out.println(sortedSet);
	}

}
