package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class AndThen {
	
	public static void main(String[] args) {
		String a,b,c;
		
		Function<Integer, Integer> negate = (i -> -i),
				square = (i -> i * i),
				fuck = (i -> i * i),
				negateSquare = negate.compose(square);
		System.out.println(negateSquare.apply(10));
		
		Predicate<String> whatever = u -> u.equals("oi"),
				whatever2 = u -> u.equals("ola");
		
		System.out.println(whatever.test("oi"));
		System.out.println(whatever2.test("ola"));
		
		
	}
	
}