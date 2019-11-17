package streams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class OptionalMain {
	
	public static void main(String[] args) {
		selectHighestTemperature(DoubleStream.of(1d, 2d, 3d, 4d));
	}
	
	public static void selectHighestTemperature(DoubleStream temperatures) {
		OptionalDouble max = temperatures.max();
		max.ifPresent(System.out::println);
	}
	
}
