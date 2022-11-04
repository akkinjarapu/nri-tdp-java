package day008;

public class Prog005 {

	public static void main(String[] args) {
		
		String key = "kin";
		
		switch (key) {
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		case "anand":
		case "kumar": {
			
			System.out.println("VOWEL");
			break;
		}
		case "kin": {
			System.out.println("Consonant");
			break;
		}
		
		}

	}

}
