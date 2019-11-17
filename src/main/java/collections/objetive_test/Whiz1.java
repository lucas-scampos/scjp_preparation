package collections.objetive_test;

import java.util.SortedMap;
import java.util.TreeMap;

public class Whiz1 {
	
	public static void main(String args[]) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("a", "apple");
		map.put("e", "egg");
		map.put("g", "gear");
		SortedMap<String, String> smap = map.subMap("a", "e"); //a to e EXCLUSIVE
		smap.put("b", "ball");
		smap.put("f", "fish"); // if we try to add a key that is out of range we get an exception
		map.put("c", "cat");
		map.remove("a");
		System.out.println(smap);
		System.out.print(map);
		//*** After we create a submap, changes on one map will automatically updated to other one
		
	}
	
}
