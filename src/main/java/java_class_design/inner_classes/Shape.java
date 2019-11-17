package java_class_design.inner_classes;

class Shape {
	
	public Shape() {
		System.out.println("Shape constructor");
	}
	
	public class Color {
		
		public Color() {
			System.out.println("Color constructor");
		}
		
	}
	
}

class TestColor {
	
	public static void main(String[] args) {
		Shape.Color x = new Shape().new Color(); // #1
	}
	
}