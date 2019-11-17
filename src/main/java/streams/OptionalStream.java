package streams;

import java.util.Optional;

public class OptionalStream {
	
	public static void main(String[] args) {
		Optional<String> string = Optional.of(" abracadabra ");
		string.map(String::trim).ifPresent(System.out::println);
		
		Optional<String> string2 = Optional.ofNullable(null);
		System.out.println(string2.map(String::length).orElse(-1));
		
		Optional<String> string3 = Optional.ofNullable(null);
		System.out.println(string3.map(String::length).orElseThrow(IllegalArgumentException::new));
	}
	
}