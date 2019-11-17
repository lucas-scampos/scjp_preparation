package date_time_api.quiz;

import java.time.Period;

public class Whiz_5 {
	
	
	public static void main(String[] args) {
		
		Period p = Period.ofMonths(2);
		p = p.plusYears(1);
		p = p.withYears(2);
		System.out.println(p);
	}
}
