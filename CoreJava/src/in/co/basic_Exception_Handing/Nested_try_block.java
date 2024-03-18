package in.co.basic_Exception_Handing;

public class Nested_try_block{
  public static void main(String[] args) {

	  try {
		
		  
		  try {
			  int a[]= {10,20,30};
			  System.out.println(a[3]);
			  
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		  System.out.println(10/0);
	} catch (ArithmeticException e) {
		System.out.println(e);
	
	}
	  System.out.println("learn coding");
  }	  
}