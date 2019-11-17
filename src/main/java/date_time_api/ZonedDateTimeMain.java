package date_time_api;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
	
	public static void main(String[] args) {
		ZoneId myZone = ZoneId.of("America/Sao_Paulo");
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = dateTime.atZone(myZone);
		ZoneOffset zoneOffset = zonedDateTime.getOffset();
		System.out.println(zoneOffset);
	}
	
}
