package streams.quiz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 */
public class Whiz_1 {
	
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("A", "B", "C", "D");
		System.out.println(stream.peek(System.out::print).findAny().orElse("NA")); //AA
		
		List<Integer> teste = Arrays.asList(4,2,3,2);
		
		Comparator<Integer> compartor = Comparator.comparing(e -> e.intValue());
		Comparator<Integer> compartor2 = Comparator.comparing(e -> e.intValue(), Integer::compare);
		
		teste.sort(compartor);
		
		teste.forEach(System.out::println);
	}
	
}
