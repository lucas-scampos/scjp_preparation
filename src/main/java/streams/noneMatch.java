package streams;

import java.util.stream.Stream;

public class noneMatch {
	
	/**
	 * returns wheter no elements of this stream match the proided predicate
	 * short-circuit
	 * terminal operation
	 */
	
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("CSE","C++", "Jav","DS");
		
		boolean answer = stream.noneMatch(str -> str.length() == 4);
		System.out.println(answer);
	}
	
}
