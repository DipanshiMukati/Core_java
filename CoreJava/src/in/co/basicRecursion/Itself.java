package in.co.basicRecursion;

public class Itself {

	public static void main(String[] args) {
		Itself i = new Itself();
		 int a=i.sum(3);
		  System.out.println("sum first N natural no:"+a);
	}
	 int sum(int b) {
		 if(b>0)
		 {
			 return b +sum(b-1);//calling
		 }
		 else {
			return 0;
		}
	 }
	
	
}
