package day018;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> of = Set.of("India", "Australia", "South Africa");
		
		HashSet<String> countries = new HashSet<>(of);
		System.out.println(countries);
		
		LinkedHashSet<String> countries1 = new LinkedHashSet<>(of);
		System.out.println(countries1);
		
		TreeSet<String> countries2 = new TreeSet<>(of);
		System.out.println(countries2);
		
	}
	
}
