package date_time_api.quiz;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Whiz_10 {
	
	public static void main(String[] args) {
		Instant now = Instant.now();
		now = now.truncatedTo(ChronoUnit.MONTHS); //FIXME an exception, truncating cause to round down, for ex. MINUTES
		System.out.println(now);
	}
	
}
