package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UsingFlatMap {
	
	public static void main(String[] args) {
		//		List<List<Integer>> intsOfInts = Arrays.asList(
		//				Arrays.asList(1, 3, 5),
		//				Arrays.asList(2, 4));
		//
		//		intsOfInts.stream()
		//				.flatMap(ints -> Stream.of("1", "2", "3"))
		//				.sorted()
		//				.map(i -> i + i)
		//				.forEach(System.out::println);
		
		/** In java 8, Stream can hold different data types
		 * Stream<String[]>
		 * Stream<Set<String>>
		 * Stream<List<String>>
		 * Stream<List<Object>>
		 *
		 * But, the stream operationgs (filter, sum, distinct) and collectors do not support it, so we need flapMap() to do
		 * the following conversion
		 *
		 * Stream<String[]> -> flapMap -> Stream<String>
		 * Stream<Set<String[]>> -> flapMap -> Stream<String>
		 * Stream<List<String[]>> -> flapMap -> Stream<String>
		 *
		 * { {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}
		 *
		 * */
		
		//*** Stream + String[] + flatMap *****
		
		String[][] data = new String[][] {{"a", "b"}, {"c", "d"}, {"e", "f"}};
		
		// Stream<String[]>
		Stream<String[]> temp = Arrays.stream(data);
		
		//filter a stream of String[] and return a string[]?
		//		Stream<String[]> stream = temp.filter( x -> "a".equals(x.toString())); FIXME doesnt work because of String[]
		
		Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
		
		Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));
		
		stream.forEach(System.out::println);
		
		
		// ***** Stream + primitive + flatMapToInt
		
		int[] intArray = {1, 2, 3, 4, 5, 6};
		
		//1. Stream<int[]>
		Stream<int[]> streamArray = Stream.of(intArray);
		
		//2. Stream<int[]> -> flatMap -> intStream
		IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));
	}
	
	static void testeComPojo() {
		Student obj1 = new Student();
		obj1.setName("mkyong");
		obj1.addBook("Java 8 in Action");
		obj1.addBook("Spring Boot in Action");
		obj1.addBook("Effective Java (2nd Edition)");
		
		Student obj2 = new Student();
		obj2.setName("zilap");
		obj2.addBook("Learning Python, 5th Edition");
		obj2.addBook("Effective Java (2nd Edition)");
		
		List<Student> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		
		List<String> collect = list.stream().map(x -> x.getBook())
			.flatMap(x -> x.stream()).distinct().collect(Collectors.toList());
		
		collect.forEach(x -> System.out.println(x));
	}
	
}

class Student {
	
	private String name;
	private Set<String> book;
	
	public void addBook(String book) {
		if (this.book == null) {
			this.book = new HashSet<>();
		}
		this.book.add(book);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<String> getBook() {
		return book;
	}
	
}