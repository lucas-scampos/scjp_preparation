package java_class_design.lambda;

class LambdaFunctionTest {
	
	@FunctionalInterface
	interface LambdaFunction {
		
		int apply(int j);
		
		boolean equals(java.lang.Object arg0);
		
	}
	
	public class Inner {
		
		void sayHello() {
			System.out.println("say hello");
		}
		
	}
	
	public static void main(String[] args) {
		LambdaFunction lambdaFunction = i -> i * i; // #1
		LambdaFunctionTest.Inner x = new LambdaFunctionTest().new Inner();
		x.sayHello();
		
		System.out.println(lambdaFunction.apply(10));
	}
	
}