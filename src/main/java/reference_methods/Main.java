package reference_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		

		//Static Reference method
		/*people.add(new Person("John", "Doe"));
		people.add(new Person("Jane", "Roe"));
		Stream<Person> personStream = people.stream();
		personStream.forEach(Person::fullName);*/


		//Reference to an instance method of an arbitrary object example
		/*people.add(new Person("John", Person.Gender.MALE));
		people.add(new Person("Jane", Person.Gender.FEMALE));
		Stream<Person> personStream = people.stream();
		personStream.filter(Person::isMale).forEach(p -> System.out.println(p.getFirstName()));*/


		//Reference to an instance Method of a Particular Object example
		people.add(new Person("Eva"));
		people.add(new Person("Adam"));
		Stream<Person> personStream = people.stream();
		PersonSorter sorter = new PersonSorter();
		personStream.sorted(sorter::sort).forEach(System.out::println);


		//Refence to a Constructor example
		Stream<Data> dataStream = Stream.generate(Data::new).limit(10).filter(d -> d.getVar() % 2 == 0);
		System.out.println(dataStream.count());


	}
}
