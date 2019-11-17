package java_class_design.quiz;

public class Whiz_2 {
	
	static int y = 1;
	
	public static void main(String[] args) {
		abstract class Cal {
			
			public abstract int calc(int x);
			
		}
		
		Cal c = new Cal() {
			public int calc(int x) {
				return x - y;
			}
		};
		
		System.out.println(c.calc(2));
	}
	
	public class Teste{
		
		void teste(){ //FIXME pode acessar atributes estaticos, porem o metodo nao pode estatico
			System.out.println(y);
		}
	}
}
