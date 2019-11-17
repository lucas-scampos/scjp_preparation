package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		Stream<Integer> originalStream = Stream.of(0, 1,-1, -2, 2);
		Stream<Integer> filteredStream = originalStream.filter(i -> i > 0);
		filteredStream.forEach(i -> System.out.println(i));

		Stream<Integer> stream = Stream.of(1, 2, 3);
		/*stream.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer number) {
				number = 2 * number;
				System.out.println(number);
			}
		});
		*/
		stream.forEach(new ConsumerTeste());
		/*
		List<String> list = Arrays.asList("j","a","v","a");
		list.forEach(s ->{
			s = s.toUpperCase();
			System.out.print(s);
		});

		Stream<String> stream = Stream.of("Whizlabs");
		stream = stream.filter(s -> s.startsWith(" J"));

		stream.forEach(s -> System.out.println(s));*/
		
		// factorial of 5
		System.out.println(IntStream.rangeClosed(1, 5).reduce((x, y) -> (x * y)).getAsInt());
	}
}

class ConsumerTeste implements java.util.function.Consumer<Integer>{
	
	@Override
	public void accept(Integer number) {
		Integer numberTimesTwo = number * 2;
		System.out.println(numberTimesTwo);
	}
	
}