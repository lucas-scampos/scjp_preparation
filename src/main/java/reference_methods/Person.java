package reference_methods;

public class Person {

	private String firstName;
	private String lastName;
	private Gender gender;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(String firstName, Gender gender) {
		this.firstName = firstName;
		this.gender = gender;
	}

	public Person(String firstName) {
		this.firstName = firstName;
	}

	public static void fullName(Person person) {
		String fullName = person.firstName + " " + person.lastName;
		System.out.println(fullName);
	}

	public boolean isMale() {
		return gender == Gender.MALE;
	}

	public String getFirstName() {
		return firstName;
	}

	public enum Gender {
		MALE, FEMALE
	}

}

class PersonSorter{
	public int sort(Person person1, Person person2){
		return person1.getFirstName().compareTo(person2.getFirstName());
	}
}

