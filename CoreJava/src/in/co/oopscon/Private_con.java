package in.co.oopscon;

public class Private_con {
	int a; double b; String c;
	private Private_con()
	{
		a = 10; b =30.56; c ="ankit";
		System.out.println(a+" "+b+" "+c);
	}
	  
	public static void main(String[] args) {
		Private_con p = new Private_con();  

	}

}
