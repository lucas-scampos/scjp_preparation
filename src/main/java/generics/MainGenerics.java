package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MainGenerics {

	public static void main(String[] args) {

		//Referencing a class
		Person<String, Integer> person;

		//instantiating a generic class
		Person<String, Integer> person1 = new Person<String, Integer>("Whiz", 10);

		//Using the diamond
		Person<String, Integer> person2 = new Person<>("Whiz", 10);

		Person person3 = new Person("Whiz", 10); // Issues warning

		Whizlabs whizlabs = new Whizlabs();
		Whizlabs whizlabs1 = new Whizlabs<>();
		Whizlabs whizlabs2 = new Whizlabs<String>();


		Integer input = 0;
		Data data = new Data<Number>(input);
		Integer output = (Integer) data.getVarT(); // needs a cast

		Map map = new HashMap<String, Integer>();
//		Map<> map2 = new HashMap<String, Integer>;
//		Map<String, Number> map3 = new HashMap<String, Integer>();
//		Map<Object, Object> map3 = new HashMap<String, Integer>();

	}
}

 class Teste {
	private int var;
	public Teste(int var) {
		this.var = var;
	}
	public int getVar() {
		return var;
	}
}