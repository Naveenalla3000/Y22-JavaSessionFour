
public class ConstructorChaining {
	public ConstructorChaining() {
		this(1); 
		System.out.println("default constructor");
		
	}
	public ConstructorChaining(int x) {
		this(1,2); 
		System.out.println(x); 
	}
	public ConstructorChaining(int x, int y) {
		System.out.println(x+y); 
		
	}
	
	public static void main(String args[]) {
		ConstructorChaining obj = new ConstructorChaining(); 
	}
}
