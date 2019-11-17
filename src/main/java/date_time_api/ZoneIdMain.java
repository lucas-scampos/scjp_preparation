package date_time_api;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
	
	public static void main(String[] args) {
		System.out.println("My zone id is: " + ZoneId.systemDefault());
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		System.out.println("Number of available time zones is: " + zones.size());
		zones.forEach(System.out::println);
	}
}
