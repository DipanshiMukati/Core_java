package in.co.basic_Exception_Handing;

public class NumberFormatException {
public static void main(String[] args) {
	String str = "ankit"; 
try {
	int a = Integer.parseInt(str);
	System.out.println(a);
	
	
} catch (Exception e) {
	System.out.println("String  "+str+"  can't be Converted to integer");
   }
   System.out.println("main methaod ended");
  }
 }
