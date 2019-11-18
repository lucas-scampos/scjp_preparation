package lambda.quiz;

import java.util.function.DoubleSupplier;

public class Whiz_7 {
	
	public static void main(String[] args) {
		DoubleSupplier sups = () -> Math.random() * 10;
		//		System.out.println(sups.get());
		System.out.println(sups.getAsDouble());
	}
	
}
