
public class ArrayObj {
	
	public ArrayObj(int x, int y, int z) {
		int sum = x+y; 
		System.out.println("Obj id = "+z); 
		System.out.println(sum); 
	}
	
	public static void main(String args[]) {
		
		ArrayObj[] ob = new ArrayObj[10]; 
		
		int a =0, b=0;
		for(int i=0; i<10; i++) {
			ob[i] = new ArrayObj(a++, b++, i); 
		}
		
	}
}
