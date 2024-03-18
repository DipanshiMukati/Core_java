package in.co.basic_Exception_Handing;

public class Null_Pointer_Exception{
	public static void main(String[] args) {
	String str = "ankit" ;
	try {
		System.out.println(str.toUpperCase());
	} catch (Exception e) {
		System.out.println("exception");
      }
	}
  }