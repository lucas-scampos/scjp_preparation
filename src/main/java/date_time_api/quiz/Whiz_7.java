package date_time_api.quiz;

import java.time.LocalDate;

public class Whiz_7 {
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2014, 2, 15);
		System.out.println(date.getMonthValue() + " : " + date.getDayOfWeek());
	}
	
}
