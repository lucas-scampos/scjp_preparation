package date_time_api;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class DayLightSavings {
	
	public static void main(String[] args) {
		ZoneId aucklandZone = ZoneId.of("Pacific/Auckland");
		Duration aucklandDST = aucklandZone.getRules().getDaylightSavings(Instant.now());
		System.out.printf("Auckland zone DST is: %d hours", aucklandDST.toHours());
	}
}
