package nio_2.quiz;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Whiz_3 {
	
	static boolean f;
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("I:\\whizlabs");
		FileVisitor<Path> searcher = new Search();
		Files.walkFileTree(path, searcher);
		if (!f) {
			System.out.print("No matches");
		}
	}
	
	private static final class Search extends SimpleFileVisitor<Path> {
		
		public FileVisitResult visitFile(Path file, BasicFileAttributes bfa) throws IOException {
			PathMatcher pm = FileSystems.getDefault().getPathMatcher("regex:*");
			if (pm.matches(file.getFileName())) {
				System.out.println(file);
				f = true;
			}
			return FileVisitResult.CONTINUE;
		}
		
	}
	
}
