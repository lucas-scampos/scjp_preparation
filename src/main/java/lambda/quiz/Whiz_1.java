package lambda.quiz;

import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class Whiz_1 {
	
	
	public static void main(String[] args) {
		Stream<Double> dbls = Stream.of(10.0, 20.0, 30.0);
		
		ToIntFunction<Double> lif = d -> d.intValue();
		
		Stream<Integer> ints = dbls.mapToInt(lif).boxed();
		
		ints.forEach(System.out::println);
	}
	
}
