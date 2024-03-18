package in.co.bssic_Abstract;

public class Testbike  {
	
	public static void main(String[] args) {
		
		Bike b = new Bike() {
			
			@Override
			public void company() {
				
		System.out.println("All type & color of bike");
			}
		};
		b.company();
		
		
	Honda h = new Honda() {
		
		@Override
		public void company() {
			
			System.out.println("this is Honda company");
		}
		
	};
	h.color();
	h.company();
	
	Bajaj bj = new Bajaj() {
		
		@Override
		public void company() {
			
			System.out.println("this is bajaj company");
			
		}
	};
	bj.color();
	bj.company();
	
		
   }
 
}