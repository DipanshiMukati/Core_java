package in.co.oopscon;

 class Anuj{
	 int a;double b; String c;
	 Anuj(){
		 a =100; b=45.32; c ="ankit";
				 
	 }
	 Anuj(int x)
	 {
		 a=x;
	 }
	 Anuj(double y, String z){
		 b=y; c=z;
	 }
 }
public class Con_overlodding {
	public static void main(String[] args) {
		
	Anuj a = new Anuj();
	Anuj a2 = new Anuj(10);
	Anuj a3 = new Anuj(23.34,"siya");
	System.out.println(a.a+" "+a.b+" "+a.c);
	System.out.println(a2.a);
	System.out.println(a3.b+" "+a3.c);
	}

}
