package date_time_api.quiz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

public class Whiz_4 {
	
	public static void main(String[] args) {
		Year y = Year.of(1991);
		LocalDate loc = y.atDay(32);
		LocalDateTime ldt = loc.atStartOfDay(); // Month of ldt will be February
	}
}
