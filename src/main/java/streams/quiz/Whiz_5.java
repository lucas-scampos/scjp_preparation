package streams.quiz;

import java.util.Comparator;
import java.util.stream.Stream;

public class Whiz_5 {
	
	public static void main(String[] args) {
		Stream stream = Stream.of(10, 20, "30");
		
		boolean out  = stream.allMatch( in -> in instanceof Number);
		System.out.println(out);
	}
	
}
