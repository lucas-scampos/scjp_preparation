package java_io_fund.quiz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Whiz_2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("file.txt");
		pw.print("Whiz");
		pw.print(new char[] {'l', 'a', 'b'});
		pw.println();
		pw.flush();
		pw.close();
	}
	
}
