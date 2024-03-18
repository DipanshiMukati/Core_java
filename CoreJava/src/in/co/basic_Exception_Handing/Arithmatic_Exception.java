package in.co.basic_Exception_Handing;

public class Arithmatic_Exception {
	  public static void main(String[] args) {
		
		  System.out.println("main method started");
		  int a = 10, b=0, c;
		  try {
			  c=a/b;//c =10/0
			  System.out.println(c);  
		  }
		  catch (Exception e) {
			 System.out.println(e);
			 }
		  System.out.println("main method ending");
			
		}
		 
	  
	

}
