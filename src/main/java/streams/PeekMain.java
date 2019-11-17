package streams;

import static java.lang.System.out;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekMain {
	
	public static void main(String[] args) {
//		final List<String> strings
//				= Stream.of("one", "two", "three", "four")
//				.peek(e-> out.println("Original Element: " + e))
//				.filter(e -> e.length() > 3)
//				.peek(e -> out.println("Filtered value: " + e))
//				.map(String::toUpperCase)
//				.peek(e -> out.println("Mapped value: " + e))
//				.collect(Collectors.toList());
//		out.println("Final Results: " + strings);
		
		long count = Stream.of(1, 2, 3, 4, 5)
				.map(i -> i * i)
				.peek(i -> System.out.printf("%d ", i))
				.count();
		System.out.printf("%nThe stream has %d elements", count);
	}
	
}
