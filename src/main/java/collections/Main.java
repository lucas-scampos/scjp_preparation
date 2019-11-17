package collections;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		/*TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);
		treeSet.add(6);
		treeSet.add(5);
		treeSet.add(2);

		treeSet.ceiling(4);
		treeSet.floor(4);

		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("A", "Amanda");
		treeMap.put("L", "Lucas");
		treeMap.put("B", "Bola");

		treeMap.entrySet();*/


		/*Set<PersonComparable> people = new TreeSet<>();
		people.add(new PersonComparable("Liam", 30));
		people.add(new PersonComparable("Emma", 25));
		people.add(new PersonComparable("Emma", 20));

		for(PersonComparable person : people){
			System.out.println(person.getName() + " :" + person.getAge());
		}*/


	/*	List<PersonComparator> people = new ArrayList<>();
		people.add(new PersonComparator("Liam", 30));
		people.add(new PersonComparator("Emma", 25));
		people.add(new PersonComparator("Emma", 20));

		Collections.sort(people, new MyComparator());

		for(PersonComparator person : people){
			System.out.println(person.getName() + " :" + person.getAge());
		}*/
		
		System.out.println("---- TREESET ----");
		Set<PersonComparable> people = new TreeSet<>();
		people.add(new PersonComparable("Liam", 30));
		people.add(new PersonComparable("Emma", 25));
		people.add(new PersonComparable("Emma", 20));
		
		people.forEach(p -> System.out.println(p.getName() + " :" + p.getAge()));
		
		System.out.println("----\n HASHSET ----");
		
		Set<PersonComparator> people2 = new HashSet<>();
		people2.add(new PersonComparator("Emma", 20));
		people2.add(new PersonComparator("Liam", 30));
		people2.add(new PersonComparator("Emma", 25));
		
		people2.forEach(p -> System.out.println(p.getName() + " :" + p.getAge()));
		
	}
	
}
