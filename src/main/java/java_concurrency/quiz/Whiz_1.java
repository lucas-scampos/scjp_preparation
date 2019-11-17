package java_concurrency.quiz;

import java.util.concurrent.atomic.AtomicInteger;

public class Whiz_1 {
	
	int val = 10;
	int x;
	
	Whiz_1(int i) {
		val = i;
	}
	
	private AtomicInteger value = new AtomicInteger(val);
	
	public static void main(String[] args) {
		Whiz_1 wh = new Whiz_1(5);
		System.out.print(wh.value.decrementAndGet());
	}
	
}
