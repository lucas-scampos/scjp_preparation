package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class FiltersMain {

	public static void main(String[] args) {

		Collection<Integer> collection = new ArrayList<>();
		collection.add(1);
		collection.add(2);
		collection.add(3);
		collection.add(4);

		collection.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer i) {
				return i % 2 == 0;
			}
		});

		for (Integer number : collection){
			System.out.println(number);
		}
	}
}
