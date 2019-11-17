package locale.quiz;

import java.util.Locale;
import java.util.ResourceBundle;

public class Whiz_1 {
	
	public static void main(String[] a) {
		Locale locale = new Locale("de");
		ResourceBundle rb = ResourceBundle.getBundle("SRBundel");
		System.out.print(rb.getString("Hello"));
	}
	
}
