package nio_2.quiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;

public class Whiz_2 {
	public static void main(String [] args)throws IOException {
		Path path = Paths.get("..\\myfile.txt");
		Map mp = new HashMap<String, Object>();
		//insert here
		
		mp = Files.readAttributes(path, "*");
//		Files.readAttributes(path, BasicFileAttributes.class);
		System.out.print(mp);
	}
}
