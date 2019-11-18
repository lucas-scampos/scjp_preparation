package java_io_fund.quiz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Whiz_4 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("ocajp.txt");
		
		//		Files.lines(f.getAbsolutePath()); FIXME Files.lines(Path path) returns -> STREAM
		Files.readAllLines(Paths.get(f.getAbsolutePath())); //Returns List<String>
	}
	
}
