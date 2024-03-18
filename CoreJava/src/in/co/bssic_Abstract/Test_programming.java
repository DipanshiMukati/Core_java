package in.co.bssic_Abstract;

public class Test_programming {
	public static void main(String[] args) {
		
	Programming p = new Programming() {
		
		@Override
		public void Developer() {
			System.out.println("first class");	 	
		}
	};
	
	p.Developer();
	p.company();
	

	HTML h = new HTML();
	h.Developer();
	h.company();
	
	Java j = new Java();
	j.Developer();
	j.company();
	
	}
	
}