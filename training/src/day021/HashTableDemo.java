package day021;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(1, "Ayesha");
		hashtable.put(2, "Sai Krishna");
		hashtable.put(1, "Bhanu Prasad");
		
		System.out.println(hashtable);
		
		
	}

}
