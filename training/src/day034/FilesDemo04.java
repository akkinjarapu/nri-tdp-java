package day034;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesDemo04 {

	public static void main(String[] args) throws IOException {
		Files.list(Paths.get("/src/day031")).forEach(path -> {
			System.out.println(path);
			File file = path.toFile();
			System.out.println(file.isDirectory());
			System.out.println(file.isFile());
			System.out.println(file.isHidden());
		});
	}

}
