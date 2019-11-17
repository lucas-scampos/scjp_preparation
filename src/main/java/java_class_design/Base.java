package java_class_design;

class Base {
	
	public static void aMethod (long val1, int val2) {
		System.out.println ("long, int");
	}
	
	public static void aMethod (int val1, long val2) {
		System.out.println ("int, long");
	}
}

class DeriOne extends Base {
}

class DeriTwo extends Base {

}

class ArrayStore {
	
	public static void main(String[] args) {
		Base[] baseArr = new DeriOne[3];
//		baseArr[0].aMethod(9, 10);
		baseArr[0] = new DeriOne();
		baseArr[2] = new DeriTwo();
		System.out.println(baseArr.length);
	}
	
}