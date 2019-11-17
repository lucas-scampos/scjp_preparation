package reference_methods;

import java.util.Random;

public class Data {

	private int var;
	private static Random generator = new Random();

	public Data() {
		this.var = generator.nextInt();
	}

	public int getVar() {
		return var;
	}
}
