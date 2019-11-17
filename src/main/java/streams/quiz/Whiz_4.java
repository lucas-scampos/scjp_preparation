package streams.quiz;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.LongStream;

public class Whiz_4 {
	
	public static void main(String[] args) {
		LongStream longs = LongStream.of(1, 2, 3);
		OptionalDouble x = longs.average();
	}
	
}
