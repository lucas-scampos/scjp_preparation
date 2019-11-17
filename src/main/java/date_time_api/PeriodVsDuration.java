package date_time_api;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * The main distinction between the two classes is that
 * Period uses date-based values, while Duration uses time-based values.
 */
public class PeriodVsDuration {
	
	public static void main(String[] args) {
		// PERIOD
		LocalDate startDate = LocalDate.of(2015, 2, 20);
		LocalDate endDate = LocalDate.of(2017, 1, 15);
		
		Period period = Period.between(startDate, endDate);
		
		System.out.println("Years:" + period.getYears());
		System.out.println("months:" + period.getMonths());
		System.out.println("days:" + period.getDays());
		System.out.println(period.isNegative()); //See if end date < start date
		
		Period fromUnits = Period.of(3, 10, 10);
		Period fromDays = Period.ofDays(50);
		Period fromMonths = Period.ofMonths(5);
		Period fromYears = Period.ofYears(10);
		Period fromWeeks = Period.ofWeeks(40); // days = 40 * 7
		
		Period fromCharYeras = Period.parse("P2Y");
		assert 2 == fromCharYeras.getYears();
		
		System.out.println(period.plusDays(50).plusDays(4).getDays());
		
		// DURATION
		
		Instant start = Instant.parse("2017-10-03T10:15:30.00Z");
		Instant end = Instant.parse("2017-10-03T10:16:30.00Z");
		
		Duration duration = Duration.between(start, end);
		assert 60 == duration.getSeconds();
		
		LocalTime start2 = LocalTime.of(1, 20, 25,  1024);
		LocalTime end2 = LocalTime.of(3, 22, 27, 1544);
		
		Duration.between(start2, end2).getSeconds();
	}
	
}
