package in.co.oopscon;

class Aman{
	int a; String b,d;
	int c;
	Aman(){
		a=10;  b="LearnCoding";
		System.out.println(a+" "+b);
	}
	Aman(Aman r)
	{
		c = r.a;
		d  =r.b;
		System.out.println(c+" "+d);
	}
}
public class Copy_con {
public static void main(String[] args) {
	Aman r= new Aman();
	Aman r2 = new Aman (r);
	
	
     }
}
