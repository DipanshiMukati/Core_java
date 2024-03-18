package in.co.Interface;

public class RajTech implements Gill{

	@Override
	public void webdesign() {
		System.out.println("IT IS USE OF HTML");
	}

	@Override
	public void webdevelope() {
	
			System.out.println("IT IS USE OF JAVA");
	}

	@Override
	public void name() {
	System.out.println("Employee");
	}
    public static void main(String[] args) {
		
    	RajTech r = new RajTech();
    	r.name();
    	r.webdesign();
    	r.webdevelope();
	}
	
	

}