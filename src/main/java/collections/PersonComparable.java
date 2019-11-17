package collections;

public class PersonComparable implements Comparable<PersonComparable> {

	private String name;
	private int age;

	public PersonComparable(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(PersonComparable person) {
		int comp = this.name.compareTo(person.name);

		return comp != 0 ? comp : person.age - this.age;
	}
}
