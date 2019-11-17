package java_io_fund.quiz;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Whiz_3 {
	
	public static void main(String[] args) {
		int i = 123;
		try {
			FileOutputStream out = new FileOutputStream("test.txt");
			ObjectOutputStream oout = new ObjectOutputStream(out);
			//insert here
			
			oout.write(i);
			oout.write(new Integer(i));
			oout.writeObject(i);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
