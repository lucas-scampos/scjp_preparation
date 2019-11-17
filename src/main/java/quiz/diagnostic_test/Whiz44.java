package quiz.diagnostic_test;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Whiz44 {
	
	public static void main(String[] args) {
		
		Stream<Student> stream = Stream.of(new Student("Lucas"), new Student("Waa"));
		Stream<String> strings = stream.map(s -> s.getName());
		Stream<Student> strings2 = stream.flatMap(s -> Stream.of(new Student("a")));
		
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
