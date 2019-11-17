package exception_and_assertions.quiz;

public class Whiz_2 {
	
	/** When an assert statement has two expressions, the second MUST RETURN A VALUE
	*
	* */
	public static void main(String[] args) {
		int j = 9;
		assert (++j > 7) : "Error";
		assert (j == 12) : j;
//		assert (++j > 8) : System.out.println(j);
		assert (j == 12) : new Whiz_2();
	}
	
}
