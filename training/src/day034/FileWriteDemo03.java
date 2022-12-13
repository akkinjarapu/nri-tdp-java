package day034;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteDemo03 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("sample.txt");
		try(BufferedWriter writer = Files.newBufferedWriter(path)) {
			writer.append("Anand");
			writer.newLine();
			writer.append("Kumar");
			writer.newLine();
		}
	}

}
