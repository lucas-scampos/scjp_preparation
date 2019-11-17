package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalInterfaces {
	
	
	public static void main(String[] args) {
		//BiFunction interface
		BiFunction<String, String, String> concatStr = (x, y) -> x + y;
		System.out.println(concatStr.apply("hello ", "world"));
		
		BiFunction<Double, Double, Integer> compareDoubles = Double::compare;
		System.out.println(compareDoubles.apply(10.0, 10.0));
		
		//BiPredicate interface
		BiPredicate<List<Integer>, Integer> listContains = List::contains;
		List aList = Arrays.asList(10, 20, 30);
		System.out.println(listContains.test(aList, 20));
		
		//BiConsumer interface
		BiConsumer<List<Integer>, Integer> listAddElement = List::add;
		List aList2 = new ArrayList();
		listAddElement.accept(aList2, 10);
		System.out.println(aList2);
		
	}
	
}
