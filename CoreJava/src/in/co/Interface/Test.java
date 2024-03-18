package in.co.Interface;

   public class Test implements Raj{

	@Override
	public void add() {
		int  a= 10 , b = 20,
		c = a+b;
		System.out.println("Addition"+c);
		
	}

	@Override
	public void sub() {
		int  b= 10 , a = 20,
	     c = a-b;
	    System.out.println("Addition"+c);
			 
		}
	public static void main(String[] args) {
		Raj r = new  Raj() {
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void sub() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	}