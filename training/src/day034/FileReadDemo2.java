package day034;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadDemo2 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(".", "src", "day031", "Pair.java");
		System.out.println(path.toFile().exists());
		
		int printableChars = Files.lines(path)
		.mapToInt(line -> line.length())
		.sum();
		
		System.out.println(printableChars);
	}

}
