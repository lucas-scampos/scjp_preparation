package java_class_design.lambda;

public class FirstLambda {
	
	public static void main(String[] args) {
		LambdaFunction lambdaFunction = () -> System.out.println("Hello world");
		lambdaFunction.call();
	}
	
}
