package day010;

import java.util.Arrays;

public class Prog014 {

	public static void main(String[] args) {
		String s = "Amaravathi    is the capital or not i don't know";
		
		String[] chars = s.split("");
		System.out.println(Arrays.toString(chars));
		
		String[] words = s.split(" ");
		System.out.println(Arrays.toString(words));
		
		String[] words1 = s.split("\\s+");
		System.out.println(Arrays.toString(words1));
		
		String[] jumble = s.split("a");
		System.out.println(Arrays.toString(jumble));
	}

}
