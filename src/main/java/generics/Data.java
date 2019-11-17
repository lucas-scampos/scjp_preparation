package generics;

public class Data<T extends Number> {

	private T var;

	public Data(T var){
		this.var = var;
	}

	T getVarT(){
		return var;
	}
	
	
}
