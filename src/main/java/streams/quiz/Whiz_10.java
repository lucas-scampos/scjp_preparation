package streams.quiz;

import java.util.stream.Stream;

public class Whiz_10 {
	
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		//		double avg = stream.skip(2).mapToInt(i -> i.intValue()).average(); FIXME average() returns OptionalDouble
		//		System.out.println(avg);
	}
	
}
