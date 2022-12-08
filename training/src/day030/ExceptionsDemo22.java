package day030;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo22 {

	public static void main(String[] args) {
		System.out.println("scanner opened");
		
		try(Scanner scanner = new Scanner(System.in)) {
			scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("type an integer value");
		}
		
		System.out.println("scanner closed");
	}

}
