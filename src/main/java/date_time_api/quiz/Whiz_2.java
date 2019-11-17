package date_time_api.quiz;

import java.time.Duration;
import java.time.LocalDate;

public class Whiz_2 {
	public static void main(String[] args) {
		Duration due = Duration.ofDays(-3);
		LocalDate ld = LocalDate.of(2016, 1, 1);
//		System.out.println(ld.plus(due.toDays())); FIXME theres no signature that takes only a long
	}

}
