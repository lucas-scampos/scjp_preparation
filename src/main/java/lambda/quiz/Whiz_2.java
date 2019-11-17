package lambda.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Whiz_2 {
	
	
	public static void main(String[] args) {
		List<Integer> ins = new ArrayList<>();
		
		ins.add(3);
		ins.add(10);
		ins.add(11);
		
		Predicate<Integer> p = i -> i > 5;
		
		Predicate<Integer> p2 = p.and(i -> i < 10);
		
		System.out.println(ins.removeIf(p2));
	}
	
}
