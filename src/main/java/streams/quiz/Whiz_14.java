package streams.quiz;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Whiz_14 {
	
	public static void main(String[] args) {
		IntStream ins = IntStream.range(1, 5); //RANGE the last parameter is exclsuive
		IntConsumer con = System.out::print;
		con.accept(ins.sum());
	}
	
}
