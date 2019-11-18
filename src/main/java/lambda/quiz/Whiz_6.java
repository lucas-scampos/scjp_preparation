package lambda.quiz;

import java.util.function.BiFunction;

public class Whiz_6 {
	
	public static void main(String[] args) {
		
		//FIXME sempre eh o ultimo generic que eh o RETURN!!!
		BiFunction<Double, Double, String> fun = (a, b) -> a + b.toString();
		System.out.println(fun.apply(1.0, 2.0));
		
	}
	
}
