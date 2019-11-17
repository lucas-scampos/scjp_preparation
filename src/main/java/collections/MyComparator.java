package collections;

import java.util.Comparator;

public class MyComparator implements Comparator<PersonComparator> {

	@Override
	public int compare(PersonComparator p1, PersonComparator p2) {
		int comp = p1.getName().compareTo(p2.getName());

		return comp != 0 ? comp : p1.getAge() - p2.getAge();
	}
}
