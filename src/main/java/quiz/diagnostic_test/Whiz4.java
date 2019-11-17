package quiz.diagnostic_test;

interface I {
	
	public default void print(){
		System.out.println("I");
	}
	
	static void method(){
		System.out.println("Static");
	}
	
}

public class Whiz4{
	
	public static void main(String[] args) {
		
		I i = new I() {};
		
		i.print();
		I.method();
	}
}