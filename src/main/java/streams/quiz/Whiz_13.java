package streams.quiz;

import java.util.stream.Stream;

public class Whiz_13 {
	
	public static void main(String[] args) {
		Stream ints = Stream.of("A", "B", "C", "D");
		ints.peek(System.out::print).skip(2).count(); //FIXME count will iterate over the stream, so ABCD will be printed
	}
	
}
