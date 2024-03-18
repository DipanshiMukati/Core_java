package in.co.basic_Exception_Handing;

public class Multiple_try_catch {
	public static void main(String[] args) {
		
		try {
			int a = 10,b=3,c;
			c = a/b;
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			
			System.out.println("can't divide by zero");
		}
		
		try {
			int a[]= {10,20,30,40};
			System.out.println(a[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("beyond the array limit" );
			
		}
	}

}
