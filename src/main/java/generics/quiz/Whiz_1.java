package generics.quiz;

import java.util.ArrayList;
import java.util.List;

public class Whiz_1 {
	
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("a");
		lst.add("ab");
//		lst.stream().forEach(s -> System.out.print(s.length())).forEach(System.out::print); FIXME using two foreach in a row
	}
	
}
