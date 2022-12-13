package day034;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesDemo07 {

	public static void main(String[] args) throws IOException {
		Files.walk(Paths.get(".")).forEach(System.out::println);
	}

}
