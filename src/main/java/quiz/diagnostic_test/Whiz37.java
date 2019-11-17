package quiz.diagnostic_test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Whiz37 {
	
	public static void main(String[] args) throws IOException {
		File f = new File("ocajp.txt");
		
		Files.readAllLines(Paths.get(f.getAbsolutePath()));
		
		
	}
}
