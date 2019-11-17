package date_time_api.quiz;

import java.time.LocalDate;

public class Whiz_3 {
	
	public static void main(String[] args) {
	
//		Which of the following will create LocalDate instance with the last day
//		of the year 2016 (leap year) ?
		
//		LocalDate.parse("2016-11-31"); FIXME exception because november doesnt have 31 days
		
		LocalDate.ofYearDay(2016,366);
	}
}
