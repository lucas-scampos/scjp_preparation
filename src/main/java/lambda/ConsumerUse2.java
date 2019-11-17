package lambda;

import java.util.function.ObjIntConsumer;

public class ConsumerUse2 {
	
	public static void main(String[] args) {
		ObjIntConsumer<String> charAt = (str, i) -> str.charAt(i); // #1
//		System.out.println(charAt.accept("java", 2)); // #2
//		fails to compile because charAt returns void / consumers returns voids
	
	}
	
}
