package day034;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesDemo06 {

	public static void main(String[] args) throws IOException {
		Files.walk(Paths.get("."), 10)
			.forEach(System.out::println);
	}

}
