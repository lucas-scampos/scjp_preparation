package locale.quiz;

import java.util.Locale;

//Correct ways of creating locale object for english language
public class Whiz_2 {
	
	public static void main(String[] args) {
		Locale locale = Locale.forLanguageTag("en_US");
		Locale locale2 = new Locale("en", "US");
		Locale locale3 = Locale.ENGLISH;
	}
	
}
