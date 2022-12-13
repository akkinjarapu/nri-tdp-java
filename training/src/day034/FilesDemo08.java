package day034;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesDemo08 {

	public static void main(String[] args) throws IOException {
		Files.walk(Paths.get("."), 4)
		.filter(p ->p.toFile().isDirectory() &&  p.toString().contains("03"))
		.forEach(System.out::println);
	}

}
