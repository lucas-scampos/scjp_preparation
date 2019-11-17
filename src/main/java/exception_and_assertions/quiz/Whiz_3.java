package exception_and_assertions.quiz;

public class Whiz_3 {
	
	public static void main(String args[]) {
		try {
			new Whiz_3().meth();
		}
		catch (Exception e) {
			System.out.print("Exception");
		}
//		catch (ArithmeticException e) { FIXME arithmetic already been caught
//			System.out.print("Arithmetic");
//		}
	}
	
	public void meth() throws ArithmeticException {
		for (int x = 0; x < 5; x++) {
			int y = (int) 5 / x;
			System.out.print(x);
		}
	}
	
}
