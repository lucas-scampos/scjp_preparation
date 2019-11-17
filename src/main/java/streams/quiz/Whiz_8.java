package streams.quiz;

import java.util.Optional;
import java.util.stream.Stream;

public class Whiz_8 {
	
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(12,40,11,22);
//		Optional<Integer> min = s.filter((Integer p) -> p%2==0).min(); FIXME min expects comparator
//		System.out.println(min);
	}
}
