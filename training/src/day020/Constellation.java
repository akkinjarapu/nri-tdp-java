package day020;

import java.util.HashMap;
import java.util.Scanner;

public class Constellation {

	public static void main(String[] args) {
		HashMap<String, String> patterns = new HashMap<>(5);
		patterns.put(".**", "1");
		patterns.put("**.", "2");
		patterns.put("***", "3");
		patterns.put("*.*", "4");
		patterns.put("..*", "5");
		patterns.put("...", "");
		
		HashMap<String, Character> galaxies = new HashMap<>();
		galaxies.put("121", 'A');
		galaxies.put("333", 'E');
		galaxies.put("434", 'I');
		galaxies.put("343", 'O');
		galaxies.put("353", 'U');
		
		Scanner scanner = new Scanner(System.in);
		
		int columns = scanner.nextInt();
		scanner.nextLine();
		
		char[] row1 = scanner.nextLine().toCharArray();
		char[] row2 = scanner.nextLine().toCharArray();
		char[] row3 = scanner.nextLine().toCharArray();
		
		scanner.close();
		
		String galaxy = "";
		String pattern = "";
		for(int i = 0; i < columns; i++) {
			if (pattern.length() == 3 || row1[i] == '#') {
				galaxy += galaxies.get(pattern);
//				System.out.println(galaxy);
				
				pattern = "";
				if(row1[i] == '#') {
					galaxy += '#';
					continue;
				}
			}
			
			pattern += patterns.get("" + row1[i] + row2[i] + row3[i]);
//			System.out.println(pattern);
		}
		
		if (!pattern.isEmpty()) {
			galaxy += galaxies.get(pattern);
//			System.out.println(galaxy);
		}
		
		System.out.println(galaxy);
		
	}
}
