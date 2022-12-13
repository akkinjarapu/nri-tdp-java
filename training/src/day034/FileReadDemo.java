package day034;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(".", "src", "day031", "Pair.java");
		System.out.println(path.toFile().exists());
		
		Files.readAllLines(path).forEach(System.out::println);
	}

}
