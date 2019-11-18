package streams.quiz;

import java.util.stream.Stream;

public class Whiz_9 {
	
	public static void main(String[] args) {
		Stream<Student> stream = Stream.of(new Student("Buddhika"),
				new Student("Livera"), new Student("Sameera"));
		Stream<String> strings = stream.map(s -> s.getName());
		Stream<String> string2s = stream.flatMap(s -> Stream.of(s.getName()));
	}
	
}


class Student {
	
	private String name;
	
	public Student(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
}