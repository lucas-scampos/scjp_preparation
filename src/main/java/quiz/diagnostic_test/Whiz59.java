package quiz.diagnostic_test;

import java.util.function.Function;
import java.util.stream.Stream;

public class Whiz59 {
	
	
	public static void main(String[] args) {
		Function<String, Double> f = Double::parseDouble;
		System.out.println(f.andThen(s -> s * 2).apply("1"));
		
		Stream<Integer> teste = Stream.empty();
		System.out.println("All match" + teste.allMatch(e -> true) );
		
		teste = Stream.empty();
		System.out.println("None match" + teste.noneMatch(e -> true) );
	}
}
