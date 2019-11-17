package lambda.quiz;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Whiz_3 {
	
	public static void main(String[] args) {
		IntStream str = IntStream.range(1, 3);
		
		IntConsumer cons = System.out::print;
		
		cons.accept(str.sum());
	}
	
}
