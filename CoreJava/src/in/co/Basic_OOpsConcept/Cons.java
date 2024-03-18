package in.co.Basic_OOpsConcept;
  public class Cons{
	  int a ;
	  String name;
	  private void cons() { 
		  a =10;
		  name =null;
	  }
	 void show() {
		  System.out.println(a+" "+name);
	 }
  }
  class test{
	  public static void main(String[] args) {
		Cons c = new Cons();
		c.show();
		
		  
	}
  }
  
