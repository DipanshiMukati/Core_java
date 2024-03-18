package in.co.basic_Exception_Handing;

     // Exception write only try block 
    // finaly:>> security type  code written in finaly block

public class All_case {

	public static void main(String[] args) {
		try {
			System.out.println("Learn coding");
			int a = 20,b=0,
			c = a/b; //condition 1
			System.out.println(c);
			System.out.println("like share");
			
		} catch(Exception e) { // 
//		(NullPointerException e) { condition 2
//			int x= 20,y=0,
//			    	z = x/y; //condition 3
			System.out.println(e);
			
		}
		//
		finally {
			
//			int s= 20,p=0,
//		    	r = s/p; //condition 4
			System.out.println("subscribe");
			
		}
		System.out.println("main method ended");
	}
}
