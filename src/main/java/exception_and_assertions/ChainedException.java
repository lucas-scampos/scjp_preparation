package exception_and_assertions;

class ChainedException {
	
	public static void foo() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException oob) {
			RuntimeException re = new RuntimeException(oob);
			/* cannot be called on an exception object that already has an exception object chained
			 * during constructor call
			 */
			re.initCause(oob);
			throw re;
		}
	}
	
	public static void main(String[] args) {
		try {
			foo();
		} catch (Exception re) {
			System.out.println(re.getClass());
		}
	}
	
}