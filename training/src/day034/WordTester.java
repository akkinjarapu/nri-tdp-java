package day034;

import java.util.Scanner;

public class WordTester {

	public static void main(String[] args) {
		String input = "HANGMAN";
		StringBuilder result = new StringBuilder("_".repeat(input.length()));
		
		Scanner scanner = new Scanner(System.in);
		
		while(result.indexOf("_") >= 0) {
			char ch = scanner.next().toUpperCase().charAt(0);
			
			int i = -1;
			while((i = input.indexOf(ch, i + 1)) >= 0) {
				result.setCharAt(i, ch);
			}
			
			System.out.println(result);
		}
		
		scanner.close();
	}

}
