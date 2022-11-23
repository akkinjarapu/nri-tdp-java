package day017;

import java.util.Collection;
import java.util.List;

public class ArrayListDemo1 {
	
	public boolean containsAny(Collection<String> src, Collection<String> keys) {
		if (src == null || keys == null)
			return false;
		
		for(String key : keys) {
			
			boolean contains = src.contains(key);
			if(contains)
				return true;
			
		}
		
		return false;
	}

	public static void main(String[] args) {
		ArrayListDemo1 d = new ArrayListDemo1();
		boolean b =  d.containsAny(List.of("a", "e", "i", "o", "u"), 
				List.of("20", "u"));
		System.out.println(b);
	}

}
