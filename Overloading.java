
//write a java program to illustrate method 
//overloading or compile time polymorphism in java


public class Overloading {
	
	public static void sum(int x, int y) {
			
			
			System.out.println(x+y); 
	}
	public static void sum(double x, double y) {
		
		
		System.out.println(x+y); 
	}
	public static int sum(int x, int y, int z) {
		
		return (x+y+z); 
	}
	public static void sum() {
		System.out.println(0); 
	}
	
	public static void main(String xyz[]) {
		Overloading.sum(4, 5);
		Overloading.sum(3.45, 6.34); 
		Overloading.sum(); 
		
		int ans = Overloading.sum(1,2,3);
		System.out.println(ans); 
	}
}
