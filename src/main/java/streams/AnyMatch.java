package streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
	
	/**
	 * returns wheter any elementos of this stream match the provided predicate.
	 * short circuit
	 * terminal operation
	 */
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 12, 20);
		
		boolean answer = list.stream().anyMatch(n -> (n * (n + 1)) / 4 == 5);
		System.out.println(answer);
	}
	
}
