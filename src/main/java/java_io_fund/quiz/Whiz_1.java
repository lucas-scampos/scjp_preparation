package java_io_fund.quiz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Whiz_1 {
	
	public static void main(String[] args) throws IOException {
		BufferedWriter br = new BufferedWriter( new FileWriter("file"));
		
		//Writer eh uma classe ABSTRATA, portando nao pode passar no construtor
	}
}
