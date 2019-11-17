package streams.quiz;

import java.util.stream.Stream;

public class Whiz_2 {
	
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("123", "234", "345");
		Stream<String> out = stream.map((String s) -> s.substring(0, 1));
		out.forEach(System.out::print);
	}
	
}
