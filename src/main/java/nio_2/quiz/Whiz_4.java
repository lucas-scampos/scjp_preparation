package nio_2.quiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Whiz_4 {
	
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("F:\\Whizlabs\\java\\nio\\myfile.txt");
		Path path2 = Paths.get(".\\myfile.txt");
		System.out.print(Files.isSameFile(path1, path2)); //TRUE
	}
	
}
