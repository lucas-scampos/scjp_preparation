package lambda.quiz;

import java.util.function.ToDoubleBiFunction;

public class Whiz_5 {
	
	public static void main(String[] args) {
		ToDoubleBiFunction<Integer, Integer> ob = (f1, f2) -> f1 + f2;
		//		System.out.println(ob.apply(1, 2)); FIXME only has applyAsDouble
	}
	
}
