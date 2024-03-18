//check positive & negetive number
//input n>0 +ve Number
// input n<0 -ve Number
// input n =0 Neither  +ve nor -ve


package in.co.basic;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		 int n;
		 System.out.println("enter any Number");
		 Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 if (n>0) {
			 
			 System.out.println(" +ve Number");
			
		}
		 else if (n<0) {
			 System.out.println(" -ve Number");
			
		}
		 else {
			   System.out.println("Neither +ve nor -ve");
		}
		 
	}
}
