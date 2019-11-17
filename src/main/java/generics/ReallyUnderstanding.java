package generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReallyUnderstanding {
	
	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<>();
		String s = "abc";
		Object o = s;      // allowed
		// strings.add(o); // not allowed
		
		
//		 List<Object> moreObjects = strings; // also not allowed, but pretend it was
//		 moreObjects.add(new Date());
//		 String s = moreObjects.get(0); // uh oh
	}
	
}
