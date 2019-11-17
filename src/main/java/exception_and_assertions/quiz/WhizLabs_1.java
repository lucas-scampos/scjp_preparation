package exception_and_assertions.quiz;

public class WhizLabs_1 {
	
	/** When we are using the multicatch block the exception variable is IMPLICITLY FINAL
	*
	* */
	
	public static void main(String args[]) {
		try {
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
//			if (e instanceof ArrayIndexOutOfBoundsException) {
//				e = new ArrayIndexOutOfBoundsException("Out of bounds");
//			} else if (e instanceof NullPointerException) {
//				e = new NullPointerException("Null Value");
//			} else {
//				e = new ArithmeticException("Arithmetic");
//			}
			System.out.println(e.getMessage());
		}
	}
	
}