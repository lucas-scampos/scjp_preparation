package date_time_api.quiz;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;

public class Whiz_6 {
	
	public static void main(String[] args) {
		
		Year y = Year.of(2014);
		LocalDate ym = y.atMonthDay(MonthDay.of(3, 3));
		System.out.println(ym);
	}
	
}
