package nio_2.quiz;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Whiz_5 {
	
	public static void main(String[] args) {
		Path path1 = Paths.get("F:\\Whizlabs\\java\\NIO");
		Path path2 = Paths.get("c:\\output");
		Path path = Paths.get(path2.getRoot().toString(), path1.subpath(0, 3).toString());
		System.out.print(path.toString()); //c:\Whizlabs\java\NIO
	}
	
}
